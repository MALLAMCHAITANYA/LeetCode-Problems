class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String []words=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        return sb.toString().trim();
    }
}