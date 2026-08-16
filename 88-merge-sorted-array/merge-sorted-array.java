class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = 0;
        while(i >=0 && j < n){
            if( nums2[j] < nums1[i] ){
                int temp = nums2[j];
                nums2[j++] = nums1[i];
                nums1[i--] = temp;
            }
            else{
                break;
            }
        }
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        int l = 0;
        for(int k = m; k < m+n ; k++){
            nums1[k] = nums2[l++];
        }
        
    }
}