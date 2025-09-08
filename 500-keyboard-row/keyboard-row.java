class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res=new ArrayList<>();
        for(String word:words){
            if(word.matches("[qwertyuiopQWERTYUIOP]+")||
            word.matches("[asdfghjklASDFGHJKL]+")||
            word.matches("[zxcvbnmZXCVBNM]+")){
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}