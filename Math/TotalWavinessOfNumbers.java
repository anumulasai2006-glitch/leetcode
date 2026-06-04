

class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int i = num1; i <= num2; i++) {
            int waviness = findWaviness(i);
            ans += waviness;
        }

        return ans;
    }

    public int findWaviness(int num) {
        int[] arr = new int[1000];
        int j = 0;
        int waviness = 0;

        while (num > 0) {
            arr[j] = num % 10;
            num = num / 10;
            j++;
        }

        int n = j;

        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ||
                (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
                waviness++;
            }
        }

        return waviness;
    }
}
