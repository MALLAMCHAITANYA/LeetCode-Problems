class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int rem;
        int sum=0;
        int ans=x;
        while(x>0){
            rem=x%10;
            x/=10;
            sum+=rem;
        }
        if(ans%sum==0){
            return sum;
        }
        return -1;
    }
}