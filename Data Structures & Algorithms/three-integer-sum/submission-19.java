class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int start = 0;
        int second = start+1;
        int end = nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> grouped = new ArrayList<>();
        while(start<end && second<end){
            int tempStart = start;
            int tempSecond = second;
            int tempEnd = end;
            while(tempSecond<tempEnd){
                if(nums[tempStart]+nums[tempSecond]+nums[tempEnd] ==0){
                    List<Integer> entry = List.of(nums[tempStart],nums[tempSecond],nums[tempEnd]);
                    if(!grouped.contains(entry)){
                        grouped.add(entry);
                    }
                    System.out.println(entry);
                    tempSecond++;
                }else if(nums[tempStart]+nums[tempSecond]+nums[tempEnd]<0){
                    tempSecond++;
                }else{
                    tempEnd--;
                }
            }
            
            if(nums[start]+nums[second]+nums[end] <= 0){
                start++;
                second++;
            }else{
                end--;
            }
        }
        return grouped;
    }
}
