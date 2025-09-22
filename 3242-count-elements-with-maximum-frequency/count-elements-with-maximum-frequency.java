class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int i:map.values()){
            if(i>max){
                max=i;
            }
        }
        int count=0;
        for(int i:nums){
            if(map.get(i)==max) count++;
        }
        return count;
    }
}