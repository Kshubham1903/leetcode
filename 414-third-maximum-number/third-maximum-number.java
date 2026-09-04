class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3) return nums[nums.length-1];

        int secMax = 0 ;
        int max = nums[nums.length-1];
        int third = nums[nums.length-1];
        int index = 0;
        for(int i = nums.length-1; i >=0;i--){
            if(nums[i] != max){
                secMax = nums[i];
                index = i;
                break;
            }
        }

    for(int i = index-1; i >=0;i--){
            if(nums[i] != secMax){
                 third = nums[i];
                break;
            }
        }
return third;
    }
}