class Solution {
    public int mySqrt(int x) {
        // Step 1: Handle the edge case where x is 0
        if (x == 0) {
            return 0;
        }
        
        // Step 2: Initialize our starting number as a long 
        // to prevent integer overflow when multiplied by itself.
        long i = 1;
        
        // Step 3: Continuously check if i * i is less than or equal to x
        while (i * i <= x) {
            i = i + 1; // Increment i by 1
        }
        
        // Step 4: When the loop breaks, i * i has exceeded x.
        // Therefore, the correct integer square root is the previous number (i - 1).
        long result = i - 1;
        
        // Step 5: Cast the long result back to an int and return it
        return (int) result;
    }
}