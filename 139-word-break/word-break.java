class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Convert the List to a HashSet for O(1) lookups
        Set<String> wordSet = new HashSet<>(wordDict);
        
        // dp[i] means s.substring(0, i) can be segmented into dictionary words
        boolean[] dp = new boolean[s.length() + 1];
        
        // Base case: an empty string is trivially valid
        dp[0] = true;
        
        // Iterate through the string to build the DP table
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // If the substring up to j is valid AND the remaining substring is in the set
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // Found a valid split, move on to the next i
                }
            }
        }
        
        // The result is whether the entire string can be segmented
        return dp[s.length()];
    }
}