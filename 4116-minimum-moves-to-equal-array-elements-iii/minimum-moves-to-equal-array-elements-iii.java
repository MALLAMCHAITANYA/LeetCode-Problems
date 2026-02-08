class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int min=nums[i];
            int max=nums[nums.length-1];
            for(int j=min;j<max;j++){
                count++;
            }
        }
        return count;
    }
}