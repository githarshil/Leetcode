class Solution {
    public int sumOfSquares(int[] nums) {
     int n = nums.length;
     int sum = 0;
     int div = 1;
     for(int i = 0;i<n;i++) {
        if(n%div == 0) {
            sum+= nums[i] * nums[i];
        }
        div++;
     }   
     return sum;
    }
}