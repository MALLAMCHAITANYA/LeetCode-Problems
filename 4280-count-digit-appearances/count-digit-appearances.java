class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=check(nums[i],digit);
        }
        return ans;
    }

    private int check(int n, int digit){
        int count=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            if(rem==digit){
                count++;
            }
        }
        return count;
    }
}