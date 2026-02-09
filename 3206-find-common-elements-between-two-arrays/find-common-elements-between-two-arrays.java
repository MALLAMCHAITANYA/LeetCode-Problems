class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[]=new int[2];
        int length1=nums1.length;
        int length2=nums2.length;
        int count1=0;
        int count2=0;
        for(int i=0;i<length1;i++){
            for(int j=0;j<length2;j++){
                if(nums1[i]==nums2[j]){
                    count1++;
                    break;
                }
            }
        }
        
        for(int i=0;i<length2;i++){
            for(int j=0;j<length1;j++){
                if(nums2[i]==nums1[j]){
                    count2++;
                    break;
                }
            }
        }
        
        ans[0]=count1;
        ans[1]=count2;
        return ans;
    }
}