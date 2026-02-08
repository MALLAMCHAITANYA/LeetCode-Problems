class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>set1=new HashSet<>();

        for(char ch1:allowed.toCharArray()){
            set1.add(ch1);
        }
        int count=0;
        for(String word:words){
            boolean flag=true;
            for(char ch:word.toCharArray()){
                if(!set1.contains(ch)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}