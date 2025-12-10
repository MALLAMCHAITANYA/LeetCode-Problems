class Solution {
    public int largestAltitude(int[] gain) {
        int res[]=new int[gain.length+1];
        for(int i=1;i<res.length;i++){
            res[i]=gain[i-1]+res[i-1];
        }
        int maxNum=res[0];
        for(int i=1;i<res.length;i++){
            if(res[i]>maxNum){
                maxNum=res[i];
            }
        }
        return maxNum;
    }
}