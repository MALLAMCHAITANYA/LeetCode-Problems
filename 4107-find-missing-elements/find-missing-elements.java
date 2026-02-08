class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}