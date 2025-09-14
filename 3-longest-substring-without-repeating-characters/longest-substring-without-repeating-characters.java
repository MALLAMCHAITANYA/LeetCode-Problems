class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int e=0;
        int c=0;
        char ch[]=s.toCharArray();
        HashSet<Character>set=new HashSet<>();
        while(e<s.length()){
            if(!set.contains(ch[e])){
                set.add(ch[e]);
                c=Math.max(c,e-l+1);
                e++;
            }
            else{
                set.remove(ch[l]);
                l++;
            }
        }
        return c;
    }
}