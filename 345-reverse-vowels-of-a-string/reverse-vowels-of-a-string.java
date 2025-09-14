class Solution {
    public String reverseVowels(String s) {
        int f=0;
        int l=s.length()-1;
        char ch[]=s.toCharArray();
        while(f<l){
            if(!vowels(ch[f])){
                f++;
            }
            else if(!vowels(ch[l])){
                l--;
            }
            else{
                char temp=ch[f];
                ch[f]=ch[l];
                ch[l]=temp;
                f++;
                l--;
            }
        }
        return new String(ch);
    }

    private boolean vowels(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
        || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return true;
        return false;
    }
    
}