class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;

        for(int i=0;i<n;i++){
            int l=0;
            int r=image[i].length-1;
            while(l<=r){
                int temp=image[i][l];
                image[i][l]=image[i][r];
                if(image[i][l]==0){
                    image[i][l]=1;
                }
                else{
                    image[i][l]=0;
                }
                image[i][r]=temp;
                if(image[i][r]==1){
                    image[i][r]=0;
                }
                
                else{
                    image[i][r]=1;
                }
                l++;
                r--;
            }
        }
        return image;
    }
}