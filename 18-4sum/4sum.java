class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second elements
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                long remaining = (long) target - nums[i] - nums[j];

                Set<Long> set = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long need = remaining - nums[k];

                    if (set.contains(need)) {

                        ans.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            (int) need,
                            nums[k]
                        ));

                        // Avoid duplicate third/fourth values
                        while (k + 1 < n && nums[k] == nums[k + 1]) {
                            k++;
                        }
                    }

                    set.add((long) nums[k]);
                }
            }
        }

        return ans;
    }
}