class Solution {
    public boolean containsDuplicate(int[] nums) {
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
        // for(int i = 0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}