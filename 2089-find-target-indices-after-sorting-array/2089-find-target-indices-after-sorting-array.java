class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<Integer>();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end -start) /2;
            if(nums[mid] == target) {
                end = mid-1;
            }
            else if(nums[mid]<target) {
                start = mid+1;
            }
            else{ 
                end = mid-1;
            }
        }
        while(start<nums.length && nums[start] == target) {
            res.add(start);
            start++;
        }
        return res;
    }
}