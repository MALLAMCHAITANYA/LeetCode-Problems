class Solution {
    public int mirrorDistance(int n) {
        int ans=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        return Math.abs(temp-ans);
    }
}