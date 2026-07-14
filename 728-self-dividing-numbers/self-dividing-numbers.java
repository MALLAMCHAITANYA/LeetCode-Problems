class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer>list=new ArrayList<>();

        for(int i=left;i<=right;i++){
            int num=i;
            int temp=i;
            boolean flag=true;
            while(temp>0){
                int rem=temp%10;
                if(rem==0 || num % rem != 0){
                    flag=false;
                    break;
                }
                temp/=10;
            }
            if(flag) list.add(num);
        }
        return list;
    }
}