class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            String j=Integer.toString(i);
            for(int k=1;k<j.length()-1;k++){
                if(j.charAt(k)>j.charAt(k-1) && j.charAt(k)>j.charAt(k+1) ||
                j.charAt(k)<j.charAt(k-1) && j.charAt(k)<j.charAt(k+1)){
                    count++;
                }
            }
        }   
        return count;
    }
}