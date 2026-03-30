class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for(Integer i:nums){
            if(unique.contains(i)){
                return true;
            }else{
                unique.add(i);
            }
        }
        return false;
    }
}