class Solution {
    public int[] runningSum(int[] nums) {
        int no[] = new int[nums.length];
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum = currentSum + nums[i];
            no[i] = currentSum;
        }
        return no;
    }
}