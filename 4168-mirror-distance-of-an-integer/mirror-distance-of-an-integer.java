class Solution {
    public int mirrorDistance(int n) {
        String a=Integer.toString(n);
        StringBuilder sb=new StringBuilder(a);
        String k=sb.reverse().toString();
        int b=Integer.parseInt(k);
        return Math.abs(n-b);
    }
}