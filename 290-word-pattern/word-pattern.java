class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        if(str.length!=pattern.length()) return false;

        HashMap<Character,String>map1=new HashMap<>();
        HashSet<String>map2=new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=str[i];

            if(map1.containsKey(c)){
                if(!map1.get(c).equals(w)) return false;    
            }  
            else{
                if(map2.contains(w)) return false;
                map1.put(c,w);
                map2.add(w);
            }          
        }
        return true;
    }
}