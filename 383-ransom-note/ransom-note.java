class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char ch:magazine.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray()){
            if(!map1.containsKey(ch) || map1.get(ch)==0) return false;
            map1.put(ch,map1.get(ch)-1);
        }
        return true;
    }
}