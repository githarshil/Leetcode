class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int max = -1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int end = max;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(nums, threshold, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private boolean isValid(int[] nums, int threshold, int mid) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / mid);
        }

        return sum <= threshold;
    }
}