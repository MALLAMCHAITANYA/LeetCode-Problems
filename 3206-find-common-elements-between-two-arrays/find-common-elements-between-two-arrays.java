class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[]=new int[2];
        HashSet<Integer>set1=new HashSet<>();
        for(int i:nums2){
            set1.add(i);
        }
        int ans1=0;
        for(int i=0;i<nums1.length;i++){
            if(set1.contains(nums1[i])){
                ans1++;
            }
        }

        HashSet<Integer>set2=new HashSet<>();
        for(int i:nums1){
            set2.add(i);
        }
        int ans2=0;
        for(int i=0;i<nums2.length;i++){
            if(set2.contains(nums2[i])){
                ans2++;
            }
        }
        ans[0]=ans1;
        ans[1]=ans2;
        return ans;
    }
}