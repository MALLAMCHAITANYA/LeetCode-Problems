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
        StringBuilder sb=new StringBuilder();
        for(char ch:message.toCharArray()){
            if(ch==' '){
                sb.append(' ');
            }
            else{
                sb.append(map.get(ch));
            }
        }
        return sb.toString();
    }
}