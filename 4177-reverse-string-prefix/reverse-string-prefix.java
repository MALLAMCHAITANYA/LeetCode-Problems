class Solution {
    public String reversePrefix(String s, int k) {
        String sub=s.substring(0,k);
        String reverse=new StringBuilder(sub).reverse().toString();
        return reverse+s.substring(k);
    }
}