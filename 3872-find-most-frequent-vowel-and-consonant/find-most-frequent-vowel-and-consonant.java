class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int v=0;
        int c=0;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            char ch=entry.getKey();
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v = Math.max(v,entry.getValue());
            }
            else{
                c = Math.max(c,entry.getValue());
            }
        }
        return c+v;
    }
}