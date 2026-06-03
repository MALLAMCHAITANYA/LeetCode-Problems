class Solution {
    public int digitFrequencyScore(int n) {
        int count=0;
        while(n>0){
            int rem=n%10;
            count+=rem*1;
            n/=10;
        }
        return count;
    }
}