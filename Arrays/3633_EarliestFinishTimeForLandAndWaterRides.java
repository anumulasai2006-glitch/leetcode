class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        // Land -> Water
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = landStartTime[i] + landDuration[i];

                if (sum >= waterStartTime[j]) {
                    min = Math.min(min, sum + waterDuration[j]);
                } else {
                    min = Math.min(min, waterStartTime[j] + waterDuration[j]);
                }
            }
        }

        // Water -> Land
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = waterStartTime[i] + waterDuration[i];

                if (sum >= landStartTime[j]) {
                    min = Math.min(min, sum + landDuration[j]);
                } else {
                    min = Math.min(min, landStartTime[j] + landDuration[j]);
                }
            }
        }

        return min;
    }
}
