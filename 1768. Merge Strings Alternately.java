class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer Bf = new StringBuffer();
        for(int i=0; i<word1.length() || i<word2.length(); i++){
            if(i < word1.length()){
                Bf.append(word1.charAt(i));
            }
            if(i < word2.length()){
                Bf.append(word2.charAt(i));
            }
        }
        return Bf.toString();
    }
}
