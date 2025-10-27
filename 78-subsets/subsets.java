class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int start,int nums[],List<Integer> current,List<List<Integer>>result){
        //add current []subset to result    
        result.add(new ArrayList<>(current));
        //explore all posibilities nums=[1,2,3]
        //append - recurse - delete
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(i+1,nums,current,result);
            current.remove(current.size()-1);
        }
    }
}