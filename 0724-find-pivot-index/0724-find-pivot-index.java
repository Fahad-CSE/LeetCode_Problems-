class Solution {
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        
        // Step 1: Array ke sabhi numbers ka total sum nikal rahe hain
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }
        
        int leftSum = 0;
        
        // Step 2: Har ek index par jaakar check kar rahe hain
        for (int i = 0; i < nums.length; i++) {
            
            // Right side ka sum nikalne ka formula
            int rightSum = totalSum - leftSum - nums[i];
            
            // Agar left side ka sum aur right side ka sum barabar hai
            if (leftSum == rightSum) {
                return i; // Toh yeh wala index return kar do
            }
            
            // Agle index par jaane ke liye current number ko leftSum mein jod do
            leftSum = leftSum + nums[i];
        }
        
        // Agar koi bhi aisa index nahi mila toh -1 return kar do
        return -1;
    }
}