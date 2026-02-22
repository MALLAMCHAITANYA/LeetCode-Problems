class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            if(!map.containsKey(size)){
                map.put(size,new ArrayList<Integer>());
            }
            List<Integer>bucket=map.get(size);
            bucket.add(i);

            if(bucket.size()==size){
                ans.add(new ArrayList<Integer>(bucket));
                bucket.clear();
            }
        }
        return ans;
    }
}