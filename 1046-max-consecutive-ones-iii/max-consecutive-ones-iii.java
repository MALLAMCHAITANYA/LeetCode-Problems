// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int n=nums.length;
//         int maxCount=0;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=i;j<n;j++){
//                 if(nums[j]==0){
//                     count++;
//                 }
//                 if(count>k){
//                     break;
//                 }
//                 maxCount=Math.max(maxCount,j-i+1);
//             }
//         }
//         return maxCount;
//     }
// }


// class Solution{
//     public int longestOnes(int[] nums, int k){
//         int n=nums.length;
//         int left=0;
//         int count=0;
//         int maxCount=0;

//         for(int right=0;right<nums.length;right++){
//             if(nums[right]==0){
//                 count++;
//             }
//             while(count>k){
//                 if(nums[left]==0){
//                     count--;
//                 }
//                 left++;
//             }
//             maxCount=Math.max(maxCount,right-left+1);
//         }
//         return maxCount;
//     }
// }

class Solution{
    public int longestOnes(int[] nums, int k){
        int left=0;
        int count=0;
        int n=nums.length;

        for(int right=0;right<n;right++){
            if(nums[right]==0){
                count++;
            }
            if(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
        }
        return n-left;
    }
}