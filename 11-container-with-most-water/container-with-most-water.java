class Solution {
    public int maxArea(int[] height ){
    int maxwater = 0;
    
    int i = 0;
    int j = height.length - 1 ;

    while(i < j){
      int w = j - i;
      int h = (height[i] > height[j]) ? height[j] : height[i];
      int currentwater = w * h;
      if(currentwater > maxwater)  maxwater = currentwater;  
      if(height[i] < height[j]) {
        i++;
      }
      else {
        j--;
      }
    }



    return maxwater;


  }
}