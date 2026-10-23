class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charcount = new int[26];

        for(int i=0; i<magazine.length(); i++){
            int ch = magazine.charAt(i);
            charcount[ch - 'a']++;
        }

        for(int i=0; i<ransomNote.length(); i++){
            int ch = ransomNote.charAt(i);

            if(charcount[ch - 'a']==0){
                return false;
            }

            charcount[ch - 'a']--;
        }
        return true;
    }
}