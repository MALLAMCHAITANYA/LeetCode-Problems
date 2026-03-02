class Solution {
    public int numberOfBeams(String[] bank) {
        int count[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int c=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    c++;
                }
            }
            count[i]=c;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int c:count){
            if(c!=0){
                list.add(c);
            }
        }
        int total=0;
        int t;
        for(int i=1;i<list.size();i++){
            t=list.get(i)*list.get(i-1);
            total+=t;
        }
        return total;
    }
}