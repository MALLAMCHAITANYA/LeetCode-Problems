class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i+1;j<nums.length;j++){
                prod=(nums[i]-1)*(nums[j]-1);
                maxProd=Math.max(prod,maxProd);
            }
        }
        return maxProd;
    }
}