// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int arr[] = new int[nums.length];
//         for(int i = 0; i<nums.length; i++){
//             int list = 1;
//             for(int j=0;j<nums.length;j++){
//                 if(i != j){
//                     list = list * nums[j];
//                 }
//             }
//             arr[i] = list;
//         }
//         return arr;
//     }
// }




class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int list = 1;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = list;
            list = list * nums[i];
        }

        list = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * list;
            list = list * nums[i];
        }

        return arr;
    }
}
