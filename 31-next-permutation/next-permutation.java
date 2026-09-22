class Solution {
    public void nextPermutation(int[] nums) {

        int small=0;
        int index=-1;
        int n=nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                small=nums[i];
                index=i;
                break;
            }
        }

        if (index == -1) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            return;
        }
        int next=0;
        int nextIndex=-1;

        for(int i=n-1;i>index;i--){
            if(nums[i]>small){
                next=nums[i];
                nextIndex=i;
                break;
            }
        }

        int temp=small;
        small=next;
        next=temp;

        nums[index]=small;
        nums[nextIndex]=next;

        int l=index+1;
        int r=n-1;
        while(l<r){
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}