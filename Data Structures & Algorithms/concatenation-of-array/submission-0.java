class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length*2;
        int[] concat = new int[length];
        int i=0;

        while(i<length){
            if(i<nums.length){
                concat[i] = nums[i];
            }else{
                concat[i] = nums[i-nums.length];
            }
            i++;
        }
        return concat;
    }
}