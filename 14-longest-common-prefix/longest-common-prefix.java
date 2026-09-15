class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String one = strs[0];
        String two = strs[strs.length-1];
        int i = 0;
        while( i < one.length() && i < two.length() && one.charAt(i)==two.charAt(i)){
            i++;
        }
        return one.substring(0,i);
    }
}