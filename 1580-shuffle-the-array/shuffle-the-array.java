import java.util.*;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length=nums.length;
        int res[]=new int[length];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
            res[2*i+1]=nums[n+i];
        }
        return res;
    }
}