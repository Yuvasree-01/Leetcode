class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res =new StringBuilder();
        int minlen = Math.min(word1.length(),word2.length());
        for(int i=0;i<minlen;i++){
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }
        // if(word1.length()>word2.length()){
        //     res.append(word1.substring(minlen));
        // }
        // if(word2.length()>word1.length()){
        //     res.append(word2.substring(minlen));
        // }
                                            res.append(word1.substring(minlen)).append(word2.substring(minlen));
        return res.toString();
    }
}  