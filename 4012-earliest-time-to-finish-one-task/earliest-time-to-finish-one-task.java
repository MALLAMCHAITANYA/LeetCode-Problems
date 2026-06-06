class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime=Integer.MAX_VALUE;
        int index=1;
        for(int i=0;i<tasks.length;i++){
            minTime=Math.min(tasks[i][0]+tasks[i][1],minTime);
        }
        return minTime;
    }
}