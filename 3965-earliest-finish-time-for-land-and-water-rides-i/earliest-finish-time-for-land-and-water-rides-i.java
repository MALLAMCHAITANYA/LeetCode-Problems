class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int totalTime=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            int time=0;
            time=landStartTime[i]+landDuration[i];
            for(int j=0;j<waterStartTime.length;j++){
                int finish=Math.max(time,waterStartTime[j])+waterDuration[j];
                totalTime=Math.min(finish,totalTime);
            }
            
        }
        
            for(int i=0;i<waterStartTime.length;i++){
                int timee=0;
                timee=waterStartTime[i]+waterDuration[i];
                for(int j=0;j<landDuration.length;j++){
                    int finish=Math.max(timee,landStartTime[j])+landDuration[j];
                    totalTime=Math.min(totalTime,finish);
                }
                
            }
        
        return totalTime;
    }
}