class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int maxdiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    int diff = Math.abs(sum - target);
                    if (maxdiff > diff) {
                        maxdiff = diff;
                        res = sum;
                    }
                    start++;
                    end--;
                } else if (sum < target) {
                    int diff = Math.abs(sum - target);
                    if (maxdiff > diff) {
                        maxdiff = diff;
                        res = sum;
                    }
                    start++;
                } else {
                    int diff = Math.abs(sum - target);
                    if (maxdiff > diff) {
                        maxdiff = diff;
                        res = sum;
                    }
                    end--;
                }
            }
        }
        return res;
    }
}