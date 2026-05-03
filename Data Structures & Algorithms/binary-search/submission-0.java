class Solution {
    public int search(int[] nums, int target) {
        int pos=0;
        for(int num:nums){
            
            if(num==target){
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
