class Solution {
    public String reversePrefix(String s, int k) {
        String sub=s.substring(0,k);
        StringBuilder sb=new StringBuilder(sub);
        String rev=sb.reverse().toString();
        String ans=rev+s.substring(k,s.length());
        return ans;
    }
}