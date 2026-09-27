class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(int i=0;i<sentences.length;i++){
            String currentSentence = sentences[i];

            int count = 1;

            for(int j=0;j<currentSentence.length();j++){
                if(currentSentence.charAt(j) == ' '){
                    count++;
                }
            }
            if(count>maxWords){
                maxWords = count;
            }
        }
        return maxWords;
    }
}