class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array has 2 or fewer elements, it's already valid.
        if (nums.length <= 2) {
            return nums.length;
        }
        
        // 'i' is the pointer where the next valid element will be placed.
        int i = 2; 
        
        // 'j' scans through the array starting from the third element.
        for (int j = 2; j < nums.length; j++) {
            // If the current element is different from the element placed 2 positions back,
            // it means we haven't seen this element more than twice yet.
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        
        // 'i' represents the length of the modified array with allowed duplicates.
        return i; 
    }
}
