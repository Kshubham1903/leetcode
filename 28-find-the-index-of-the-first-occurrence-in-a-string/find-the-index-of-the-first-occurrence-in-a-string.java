class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(haystack.contains(needle)){
            int j = 0;
                for(int i = 0; i < haystack.length(); i++ ){
                    if(haystack.charAt(i) == needle.charAt(j)){
                        int k = i;
                
                        while(k < n && j < m ){
                            if(haystack.charAt(k) == needle.charAt(j)){
                                k++;j++;
                                if(j == m) return ( k - j );
                            }
                            else {
                                j = 0;
                                break;
                            }

                        }

                    }
                }
        }
        return -1;
    }
}