class Solution {
    public int maximum69Number (int num) {
        String n=Integer.toString(num);
        int len=n.length();
        StringBuilder sb=new StringBuilder(n);
        for(int i=0;i<len;i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}