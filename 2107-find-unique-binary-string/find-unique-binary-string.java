class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int length=nums.length;
        int binaryLength=(int)Math.pow(2,length);

        HashSet<String>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
    
        for(int i=0;i<binaryLength;i++){
            String binary=Integer.toBinaryString(i);
            while(binary.length()<length){
                binary="0"+binary;
            }
            if(!set.contains(binary)){
                return binary;
            }
        }
        return "";
    }
}