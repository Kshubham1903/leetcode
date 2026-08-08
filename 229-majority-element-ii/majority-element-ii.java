class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n  = (nums.length/3) + 1;
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       for(int m : nums){
            map.put(m,map.getOrDefault(m,0)+1);
            if(map.get(m) == n) list.add(m);
       }
   
    return list; 
    }
}