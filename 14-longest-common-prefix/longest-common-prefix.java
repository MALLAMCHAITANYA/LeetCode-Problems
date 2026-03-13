class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String first=strs[0];
        String last=strs[n-1];
        int i=0;
        while(i<=first.length()-1 && i<=last.length()-1){
            if(first.charAt(i)==last.charAt(i)){
                i++;
            }
            else break;   
        }
        return first.substring(0,i);
    }
}