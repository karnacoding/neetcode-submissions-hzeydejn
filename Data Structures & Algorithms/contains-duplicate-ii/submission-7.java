class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> vToLastIdx = new HashMap<>();

        for (int currIdx = 0; currIdx < nums.length; currIdx++) {
            int currentValue = nums[currIdx];

            if (vToLastIdx.containsKey(currentValue)) {
                int prevIdx = vToLastIdx.get(currentValue);

                if (currIdx - prevIdx <= k) {
                    return true;
                }
            }

            vToLastIdx.put(currentValue, currIdx);
        }

        return false;
    }
}