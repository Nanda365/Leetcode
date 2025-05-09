import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                result.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        int[] resArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArr[i] = result.get(i);
        }

        return resArr;
    }
}
