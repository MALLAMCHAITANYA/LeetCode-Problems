class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String>list=new ArrayList<>();
        int totalStringsLen=(int)Math.pow(2,n);
        String binary;
        for(int i=0;i<totalStringsLen;i++){
            binary=Integer.toBinaryString(i);
            while(binary.length()!=n){
                binary="0"+binary;
            }
            boolean valid=true;
            for(int j=1;j<n;j++){
                if(binary.charAt(j)=='0' && binary.charAt(j-1)=='0'){
                    valid=false;
                    break;
                }
            }
            if(valid){
                list.add(binary);
            }
        }
        return list;
    }
}