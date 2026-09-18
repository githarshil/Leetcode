class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n + 1];
        int count = 0;
        for (int p = 2; p * p <= n; p++) {
            if (!arr[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    arr[multiple] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(!arr[i]) {
                count++;
            }
        }
        return count;
    }
}