class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        HashSet<Integer>prefix=new HashSet<>();
        HashSet<Integer>sufix=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int k=0;k<=i;k++){
                prefix.add(nums[k]);
            }
            for(int j=i+1;j<n;j++){
                sufix.add(nums[j]);
            }
            res[i]=prefix.size()-sufix.size();
            prefix.clear();
            sufix.clear();
        }
        return res;
    }
}