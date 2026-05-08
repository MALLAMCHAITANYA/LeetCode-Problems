class Solution {
    public String reverseWords(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        String arr[]=new String[count+1];
        int index=0;
        for(int i=0;i<s.length();i++){
            String ans="";
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)!=' '){
                    ans+=s.charAt(j);
                }
                else{
                    break;
                }
            }
            arr[index++]=ans;
            i=i+ans.length();
        }
        for(int i=0;i<arr.length;i++){
            char ch[]=arr[i].toCharArray();
            int l=0, r=ch.length-1;
            while(l<r){
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
            arr[i]=new String(ch);
        }
        String res="";
        for(int i=0;i<arr.length;i++){
            res+=arr[i];
            if(i!=arr.length-1){
                res+=" ";
            }
        }
        return res;
    }
}