class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Standard for-loop using index i
        for (int i = 0; i < nums.length; i++) {
            
            // When count reaches zero, update the candidate to the current element
            if (count == 0) {
                candidate = nums[i];
            }

            // Increase count if current element matches candidate, otherwise decrease
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}