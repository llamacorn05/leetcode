class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = {0,0};
        Map <Integer, Integer> visitedElementMap= new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            int delta = target - nums[i];
            if(visitedElementMap.containsKey(delta))
                return new int[] {i, visitedElementMap.get(delta)};
            else {
                visitedElementMap.put(nums[i], i);
            }
        }
        return result;
    }
}