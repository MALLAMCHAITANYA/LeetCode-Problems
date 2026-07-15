class Solution {
    public int[] numberOfPairs(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        int count=0;
        int ans[]=new int[2];
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                    list.remove(j);
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        ans[0]=count;
        ans[1]=nums.length-count*2;
        return ans;
    }
}