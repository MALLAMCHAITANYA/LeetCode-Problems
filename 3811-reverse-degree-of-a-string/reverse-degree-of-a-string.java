class Solution {
    public int reverseDegree(String s) {
        int prod=0;
        int index;
        for(int i=0;i<s.length();i++){
            index='z'-s.charAt(i)+1;
            prod+=index*(i+1);
        }
        return prod;
    }
}