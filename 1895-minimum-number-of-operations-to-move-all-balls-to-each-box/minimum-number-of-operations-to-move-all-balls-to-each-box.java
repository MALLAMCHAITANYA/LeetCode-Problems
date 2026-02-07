class Solution {
    public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                list.add(i);
            }
            
        }
        for(int i=0;i<boxes.length();i++){
            int sum=0;
            for(int j=0;j<list.size();j++){
                sum+=Math.abs(list.get(j)-i);
            }
            ans[i]=sum;
        }
        return ans;
    }
}