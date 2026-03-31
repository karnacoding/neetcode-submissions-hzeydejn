class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            prod[i] = 1;
        }

        int i=0;
        while(i<nums.length){
            int j = i;
            while(j<nums.length-1){
                j++;
                prod[i] = prod[i] * nums[j];
            }
            int k = i;
            while(k>0){
                k--;
                prod[i] = prod[i] * nums[k];
            }
            i++;
        }
        return prod;
    }
}  
