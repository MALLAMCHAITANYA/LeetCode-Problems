class Solution {
    public String reversePrefix(String s, int k) {
        String sub=s.substring(0,k);
        String rev="";
        for(int i=k-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev+s.substring(k);
    }
}