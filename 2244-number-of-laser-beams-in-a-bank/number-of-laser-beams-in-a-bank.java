class Solution {
    public int numberOfBeams(String[] bank) {
        int total=0;
        int prev=0;
        int count[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int c=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    c++;
                }
            }
            count[i]=c;
            if(c>0){
                total+=c*prev;
                prev=c;
            }
        }
        return total;
    }
}