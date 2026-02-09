class Solution {
    public String decodeMessage(String key, String message) {
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Character>map=new HashMap<>();
        int i=0;
        for(char ch:key.toCharArray()){
            if(ch!=' ' && !map.containsKey(ch)){
                map.put(ch,alphabets.charAt(i));
                i++;
            }
        }
        String ans="";
        for(char ch:message.toCharArray()){
            if(ch==' '){
                ans+=' ';
            }
            else{
                ans+=map.get(ch);
            }
        }
        return ans;
    }
}