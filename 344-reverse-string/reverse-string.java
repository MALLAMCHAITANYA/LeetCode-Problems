class Solution {
    public void reverseString(char[] s) {

        StringBuilder sb=new StringBuilder(new String(s));
        sb.reverse();
        
        char[] rev=sb.toString().toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i] = rev[i];
        }
    }
}