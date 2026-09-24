class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            int number  = nums[i];
            int sum = 0;

            while(number > 0){
                int digit = number%10;
                sum = sum + digit;
                number = number/10;
            }

            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}