class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int temp[]=new int[order.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    temp[k++]=order[i];
                    break;
                }
            }
        }
        int res[]=new int[friends.length];
        for(int i=0;i<res.length;i++){
            res[i]=temp[i];
        }
        return res;
    }
}