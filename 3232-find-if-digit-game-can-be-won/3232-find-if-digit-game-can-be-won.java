class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            if (num < 10) {
                singleSum += num;
            } else {
                doubleSum += num;
            }
        }
        
        return singleSum != doubleSum;
    }
}