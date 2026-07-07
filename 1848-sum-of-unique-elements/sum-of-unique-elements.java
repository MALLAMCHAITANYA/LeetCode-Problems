class Solution {
    public int sumOfUnique(int[] nums) {
        // HashSet<Integer>set=new HashSet<>();
        // set.add(nums[0]);
        // for(int i=1;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         set.remove(nums[i]);
        //     }
        //     else{
        //         set.add(nums[i]);
        //     }   
        // }
        // int sum=0;
        // for(int num:set){
        //     sum+=num;
        // }
        // return sum;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int k:map.keySet()){
            if(map.get(k)==1){
                sum+=k;
            }
        }
        return sum;
    }
}