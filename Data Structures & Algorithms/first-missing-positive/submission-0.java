class Solution {
    public int firstMissingPositive(int[] nums) {
        int pos = 1;
        Arrays.sort(nums);
        //all neg, pos without 1, check pos for every value

        for(int i=0;i<nums.length;i++){
            if(nums[i] == pos){
                pos++;
            }
        }
        return pos;

    }
}