class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            int a = nums[i];
            int b = nums[i+1]; 
            int temp=a;
            a = b;
            b = temp;
            nums[i] = a;
            nums[i+1] = b;
        }
        return nums;
    }
}