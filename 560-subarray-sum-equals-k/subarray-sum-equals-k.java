class Solution {
    public int subarraySum(int[] arr, int K) {
        int prefixSum = 0;
        int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];

            count += map.getOrDefault(prefixSum-K, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
}