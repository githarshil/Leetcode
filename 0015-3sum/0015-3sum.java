class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length - 1;
            long target = -1 * nums[i];
            while (start < end) {
                int sum = nums[end]+nums[start];
                if (sum == target) {
                    Arrays.asList(nums[i], nums[start], nums[end]);
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while(start<nums.length && nums[start]==nums[start-1]) {
                        start++;
                    }
                    while(end>=0 && nums[end]==nums[end+1]) {
                        end--;
                    }
                } else if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                }
            }
        }
        return result;
    }
}