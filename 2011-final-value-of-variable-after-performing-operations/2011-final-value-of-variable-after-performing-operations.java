class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x =0;

        for (int i = 0; i < operations.length; i++){
            char sign = operations[i].charAt(1);
            if(sign == '+'){
                x++;
            }else {
                x--;
            }
        }
        return x;

    }
}