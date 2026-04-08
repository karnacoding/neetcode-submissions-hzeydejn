class Solution {
    public int majorityElement(int[] nums) {
        int occur = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > occur){
                return nums[i];
            }
        }

        return -1;
    }
}