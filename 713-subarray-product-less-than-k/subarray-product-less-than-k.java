// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         if(k<=1){
//             return 0;
//         }
//         int n=nums.length;
//         int count=0;

//         for(int i=0;i<n;i++){
//             int prod=1;
//             for(int j=i;j<n;j++){
//                 prod*=nums[j];
//                 if(prod<k){
//                     count++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int n=nums.length;
        int left=0;
        int prod=1;
        int count=0;
        if(k<=1){
            return 0;
        }
        
        for(int right=0;right<n;right++){
            prod*=nums[right];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}