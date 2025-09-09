class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();

        for(int n1:nums1){
            set1.add(n1);
        }
        for(int n2:nums2){
            set2.add(n2);
        }
        
        for(int n:set1){
            if(set2.contains(n)){
                list.add(n);
            }
        }

        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}