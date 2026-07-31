class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        map = {}

        for i in range(len(numbers)):
            curr = target - numbers[i]
            if curr in map:
                return [map[curr] + 1, i + 1]

            map[numbers[i]]=i