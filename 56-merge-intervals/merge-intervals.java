class Solution {
    public int[][] merge(int[][] intervals) {

        boolean[] merged = new boolean[intervals.length];
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            if (merged[i]) continue;

            int start = intervals[i][0];
            int end = intervals[i][1];

            boolean changed = true;

            while (changed) {
                changed = false;

                for (int j = 0; j < intervals.length; j++) {

                    if (i == j || merged[j]) continue;

                    // Check overlap
                    if (intervals[j][0] <= end &&
                        intervals[j][1] >= start) {

                        start = Math.min(start, intervals[j][0]);
                        end = Math.max(end, intervals[j][1]);

                        merged[j] = true;
                        changed = true;
                    }
                }
            }

            ans.add(new int[]{start, end});
            merged[i] = true;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}