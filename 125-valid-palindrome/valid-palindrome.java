class Solution {
    public boolean isPalindrome(String s) {
        String correct="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                correct+=Character.toLowerCase(ch);
            }
        }
        String reversed="";
        for(int i=correct.length()-1;i>=0;i--){
            reversed+=correct.charAt(i);
        }
        return reversed.equals(correct);
    }
}