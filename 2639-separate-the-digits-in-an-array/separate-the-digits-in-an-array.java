class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] digits = check(nums[i]);

            for (int d : digits) {
                list.add(d);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

    private int []check(int n){
        ArrayList<Integer>list=new ArrayList<>();
        String s=n+"";
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i)-'0');
        }

        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}