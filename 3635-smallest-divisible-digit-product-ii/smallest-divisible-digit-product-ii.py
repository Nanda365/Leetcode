class Solution:
    def smallestNumber(self, num: str, t: int) -> str:
        # Step 1: Factorize t into prime factors 2, 3, 5, 7
        temp_t = t
        counts = {2: 0, 3: 0, 5: 0, 7: 0}
        for p in (2, 3, 5, 7):
            while temp_t % p == 0:
                counts[p] += 1
                temp_t //= p
        
        # If t has any prime factor other than 2, 3, 5, 7, it's impossible
        if temp_t > 1:
            return "-1"

        def get_min_digits(a: int, b: int, c: int, d: int) -> list[int]:
            """Returns the minimal non-1 digits needed to satisfy factor counts (2^a, 3^b, 5^c, 7^d)."""
            a, b, c, d = max(0, a), max(0, b), max(0, c), max(0, d)
            res = []
            res.extend([7] * d)
            res.extend([5] * c)
            res.extend([9] * (b // 2))
            res.extend([8] * (a // 3))
            
            rem_a, rem_b = a % 3, b % 2
            if rem_a == 1 and rem_b == 0:
                res.append(2)
            elif rem_a == 2 and rem_b == 0:
                res.append(4)
            elif rem_a == 0 and rem_b == 1:
                res.append(3)
            elif rem_a == 1 and rem_b == 1:
                res.append(6)
            elif rem_a == 2 and rem_b == 1:
                res.extend([2, 6])
                
            res.sort()
            return res

        DIGIT_FACTORS = {
            1: (0, 0, 0, 0),
            2: (1, 0, 0, 0),
            3: (0, 1, 0, 0),
            4: (2, 0, 0, 0),
            5: (0, 0, 1, 0),
            6: (1, 1, 0, 0),
            7: (0, 0, 0, 1),
            8: (3, 0, 0, 0),
            9: (0, 2, 0, 0),
        }

        n = len(num)
        
        # Compute prefix factor counts for `num`
        pref_a, pref_b, pref_c, pref_d = 0, 0, 0, 0
        zero_pos = -1
        
        for idx, ch in enumerate(num):
            if ch == '0':
                zero_pos = idx
                break
            d = int(ch)
            fa, fb, fc, fd = DIGIT_FACTORS[d]
            pref_a += fa
            pref_b += fb
            pref_c += fc
            pref_d += fd

        # Check if `num` itself is valid
        if zero_pos == -1:
            if (pref_a >= counts[2] and pref_b >= counts[3] and 
                pref_c >= counts[5] and pref_d >= counts[7]):
                return num

        # Step 2: Search for same length N by changing a digit at index i
        # We can't keep a prefix containing '0'
        max_i = zero_pos if zero_pos != -1 else n - 1
        
        # Re-evaluate factors up to max_i
        cur_a, cur_b, cur_c, cur_d = 0, 0, 0, 0
        for i in range(max_i):
            fa, fb, fc, fd = DIGIT_FACTORS[int(num[i])]
            cur_a += fa
            cur_b += fb
            cur_c += fc
            cur_d += fd

        for i in range(max_i, -1, -1):
            start_digit = int(num[i]) + 1 if i < n else 1
            for d_digit in range(start_digit, 10):
                fa, fb, fc, fd = DIGIT_FACTORS[d_digit]
                rem_a = counts[2] - (cur_a + fa)
                rem_b = counts[3] - (cur_b + fb)
                rem_c = counts[5] - (cur_c + fc)
                rem_d = counts[7] - (cur_d + fd)
                
                needed_digits = get_min_digits(rem_a, rem_b, rem_c, rem_d)
                space = n - 1 - i
                
                if len(needed_digits) <= space:
                    # Construct result
                    ones = space - len(needed_digits)
                    suffix = "1" * ones + "".join(map(str, needed_digits))
                    return num[:i] + str(d_digit) + suffix

            # Backtrack cur factors for position i - 1
            if i > 0:
                fa, fb, fc, fd = DIGIT_FACTORS[int(num[i - 1])]
                cur_a -= fa
                cur_b -= fb
                cur_c -= fc
                cur_d -= fd

        # Step 3: If no valid number of length N, construct for length > N
        min_req = get_min_digits(counts[2], counts[3], counts[5], counts[7])
        target_len = max(n + 1, len(min_req))
        ones = target_len - len(min_req)
        
        return "1" * ones + "".join(map(str, min_req))