class Solution {
    public int digitFrequencyScore(int n) {
        int count = 0;
        while(n > 0){
            int p = n%10;
            n = n/10;
            count = count + p;
        }
        return count;
    }
}