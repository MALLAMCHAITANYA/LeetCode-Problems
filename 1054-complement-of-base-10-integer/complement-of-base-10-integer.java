class Solution {
    public int bitwiseComplement(int n) {
        String binary=Integer.toBinaryString(n);
        String complement="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                complement+="1";
            }
            else{
                complement+="0";
            }
        }
        int num=0;
        for(int i=complement.length()-1;i>=0;i--){
            num+=(complement.charAt(i)-'0')*(int)Math.pow(2,(complement.length()-1)-i);
        }
        return num;
    }
}