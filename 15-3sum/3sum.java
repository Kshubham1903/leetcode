class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int required = -(nums[i] + nums[j]);

                if (set.contains(required)) {

                    List<Integer> triplet = Arrays.asList(
                        nums[i],
                        nums[j],
                        required
                    );

                    Collections.sort(triplet);
                    result.add(triplet);
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}