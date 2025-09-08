class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int i=0;
        int n=s.length()-1;
        while(i<n){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}