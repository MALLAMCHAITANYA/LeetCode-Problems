class Solution {
    public String reverseStr(String s, int k) {
        int start=0;
        char ch[]=s.toCharArray();
        int n=ch.length;

        while(start<n){
            int l=start;
            int r=Math.min(start+k-1,n-1);
            while(l<r){
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;

                l++;
                r--;
            }
            start+=2*k;
        }
        return new String(ch);
    }
}