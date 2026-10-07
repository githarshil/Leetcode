class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = start + 2*i;
        }
        int sum = 0;
        for(int j = 0;j<arr.length;j++) {
            sum = sum^arr[j];
        }
        return sum;
    }
}