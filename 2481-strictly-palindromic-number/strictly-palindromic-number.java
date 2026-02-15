class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            int temp=n;
            int rem=0;
            int a=0;
            while(temp>0){
                rem=temp%i;
                a=a*10+rem;
                temp=temp/i;
            }
            int ans=0;
            int r=0;
            while(a>0){
                r=a%10;
                ans=ans*10+r;
                a=a/10;
            }
            if(ans!=a) return false;
        }
        return true;
    }
}