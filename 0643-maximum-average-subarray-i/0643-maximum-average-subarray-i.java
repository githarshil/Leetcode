class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k - 1;
        double avg = 0;
        double sum = 0;
        for(int i = 0; i<=high ; i++) {
            sum += nums[i];
        }
        avg  = sum / k;
        double max = avg;
        while(high < nums.length -1) {
            low++;
            high++;
            sum += nums[high] - nums[low - 1];
            avg = sum/k;
            max = Math.max(avg,max);
        }
        return max;
    }
}