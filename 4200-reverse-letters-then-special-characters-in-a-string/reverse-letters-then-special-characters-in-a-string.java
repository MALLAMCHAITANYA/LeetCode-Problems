class Solution {
    public String reverseByType(String s) {
        int l=0;
        int r=s.length()-1;
        char ch[]=s.toCharArray();
        while(l<r){
            if(!Character.isLowerCase(ch[l])){
                l++;
            }
            else if(!Character.isLowerCase(ch[r])){
                r--;
            }
            else{
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        l=0;
        r=s.length()-1;
        while(l<r){
            if(Character.isLowerCase(ch[l])){
                l++;
            }
            else if(Character.isLowerCase(ch[r])){
                r--;
            }
            else{
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}