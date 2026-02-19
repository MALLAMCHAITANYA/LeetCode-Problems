class Solution {
    public String clearDigits(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                s = s.substring(0, i-1) + s.substring(i + 1);
                i-=2;
            }
        }
        return s;
    }
}