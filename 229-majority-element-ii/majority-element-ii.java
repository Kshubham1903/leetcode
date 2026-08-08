class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (!list.contains(nums[i])) {

                int cnt = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        cnt++;
                    }
                }

                if (cnt > nums.length / 3) {
                    list.add(nums[i]);
                }
            }

            if (list.size() == 2) {
                break;
            }
        }

        return list;
    }
}