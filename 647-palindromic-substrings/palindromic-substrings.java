//BruteForce
// class Solution {
//     public int countSubstrings(String s) {
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(isPalindrome(s,i,j)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     private boolean isPalindrome(String s,int left,int right){
//         while(left<right){
//             if(s.charAt(left)!=s.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }


class Solution{
    public int countSubstrings(String s){
        int n=s.length();
        int count=0;

        for(int i=0;i<n;i++){
            count+=expand(s,i,i); //odd length
            count+=expand(s,i,i+1); //even lenght
        }
        return count;
    }

    private int expand(String s,int left, int right){
        int count=0;

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}