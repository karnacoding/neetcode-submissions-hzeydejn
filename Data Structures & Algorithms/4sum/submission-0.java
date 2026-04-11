class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int first = 0; first < n - 3; first++) {
            // Skip duplicate first number
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            for (int second = first + 1; second < n - 2; second++) {
                // Skip duplicate second number
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                int left = second + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[first] + nums[second] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(
                            nums[first],
                            nums[second],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicate third number
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate fourth number
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}