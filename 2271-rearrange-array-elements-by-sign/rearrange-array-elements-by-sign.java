class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n/2];
        int arr2[]=new int[n/2];
        
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr1[a++]=nums[i];
            }
        }
    
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr2[b++]=nums[i];
            }
        }

        int arr[]=new int[n];
        int index=0;

        for(int i=0;i<n/2;i++){
            arr[index++]=arr1[i];
            arr[index++]=arr2[i];
        }
        return arr;
    }
}