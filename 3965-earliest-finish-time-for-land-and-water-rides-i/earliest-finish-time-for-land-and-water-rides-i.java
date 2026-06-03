class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int totalTime=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int landFinish=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                int finish1=Math.max(landFinish,waterStartTime[j])+waterDuration[j];
                totalTime=Math.min(finish1,totalTime);
            }
        }
        
        for(int i=0;i<waterStartTime.length;i++){
            int waterFinish=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<landDuration.length;j++){
                int finish2=Math.max(waterFinish,landStartTime[j])+landDuration[j];
                totalTime=Math.min(totalTime,finish2);
            }
        }
        return totalTime;
    }
}