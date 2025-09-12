class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int e=0;
        int count=0;
        HashSet<Character>set=new HashSet<>();
        char c[]=s.toCharArray();
        while(e<s.length()){
            if(!set.contains(c[e])){
                set.add(c[e]);
                count=Math.max(count,e-l+1);
                e++;
            }
            else{
                set.remove(c[l]);
                l++;
            }
        }
        return count;
    }
}