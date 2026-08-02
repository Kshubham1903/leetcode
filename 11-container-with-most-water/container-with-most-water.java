class Solution {
    public int maxArea(int[] height ){
    int maxwater = 0;
    
    int left = 0;
    int right = height.length - 1 ;

    while(left < right){
      int currentwater = (right - left) * ((height[left] > height[right]) ? height[right] : height[left]);
      if(currentwater > maxwater)  maxwater = currentwater;  
      if(height[left] < height[right]) {
        left++;
      }
      else {
        right--;
      }
    }



    return maxwater;


  }
}