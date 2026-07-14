class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer>Smap=new HashMap<>();
        HashMap<Character,Integer>Tmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            Smap.put(ch,Smap.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            Tmap.put(ch,Tmap.getOrDefault(ch,0)+1);
        }
        
        int steps=0;
        for(char ch:Smap.keySet()){
            int sCount=Smap.get(ch);
            int tCount=Tmap.getOrDefault(ch,0);

            if(sCount>tCount){
                steps+=sCount-tCount;
            }
        }
        return steps;
    }
}