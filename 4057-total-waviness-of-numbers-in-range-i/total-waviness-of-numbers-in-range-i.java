class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=check(i);
        }
        return ans;
    }

    private int check(int n){
        if(n<100){
            return 0;
        }
        String s=n+"";
        int count=0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1) ||
            s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                System.out.println(s.charAt(i));
                count++;
            }
        }
        return count;
    }
}