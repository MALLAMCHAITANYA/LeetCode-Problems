class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            int sum=0;
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                sum+=weights[c-'a'];
            }
            int index=sum%26;
            char mapped=(char)('z'-index);
            sb.append(mapped);

        }
        return sb.toString();
    }
    
}