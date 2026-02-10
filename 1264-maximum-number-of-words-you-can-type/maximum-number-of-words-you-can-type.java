class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String parts[]=text.split(" ");
        HashSet<Character>set=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(String word:parts){
            boolean type=true;
            for(char c:word.toCharArray()){
                if(set.contains(c)){
                    type=false;
                    break;
                }
            }
            if(type){
                count++;
            }
        }
        return count;
    }
}