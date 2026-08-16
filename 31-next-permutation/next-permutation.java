class Solution {
   public  void nextPermutation(int arr[]){
    int index = -1;

    for(int i = (arr.length - 2); i >= 0; i-- ){
      if(arr[i] < arr[i+1]){
        index = i;
        break;
      }
    }
    if (index == -1){
      int i = 0;
      int j = arr.length - 1;
      reverse(arr,i,j);
    return;
    }

    for(int i = arr.length -1 ; i >= index; i--){
        if(arr[i] > arr[index]){
          int temp = arr[index];
          arr[index] = arr[i];
          arr[i] = temp;
          break;
        }
    } 
      int j = index + 1;
      int k = arr.length -1;
      reverse(arr,j,k);
   
  }

   public void reverse(int arr[], int j,int k){
         while (j < k){
          int temp = arr[j];
          arr[j++]= arr[k];
          arr[k--] = temp;
    }
   }
}