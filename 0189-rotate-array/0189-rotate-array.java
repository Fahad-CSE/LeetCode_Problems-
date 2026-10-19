// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k%n;
//         int count = 0;
//         int list = 0;
//         for(int i = n-k; i<=n ;i++){
//             nums[count] = nums[i];
//             nums[i] = nums[list];
//             count++;
//             list++;
//         }
        
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = 0;
        int list = 0;
        int[] arr = new int[n];

        for (int i = n - k; i < n; i++) {
            arr[count] = nums[i];
            count++;
        }
        for (int i = 0; i < n - k; i++) {
            arr[count] = nums[i];
            count++;
        }

        for (int i = 0; i<n; i++){
            nums[i] = arr[i];
        }
    }
}