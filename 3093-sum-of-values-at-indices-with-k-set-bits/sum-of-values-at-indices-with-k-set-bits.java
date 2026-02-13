class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            int count=0;
            String s=Integer.toBinaryString(i);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            if(count==k){
                ans+=nums.get(i);
            }
        }
        return ans;
    }
}