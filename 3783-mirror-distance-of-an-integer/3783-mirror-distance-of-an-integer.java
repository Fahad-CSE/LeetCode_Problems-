class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int reverse = 0;
        int done;
        while(n>0){
            done = n%10;
            reverse = (reverse * 10) + done;
            n = n/10; 
        }

        if(original > reverse){
            return original - reverse;
        }else{
            return reverse - original;
        }
    }
}