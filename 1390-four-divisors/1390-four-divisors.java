class Solution {
    public int sumFourDivisors(int[] nums) {
        int count = 2;
        int sum = 0;
        int res = 0;
        for(int i = 0;i<nums.length;i++) {
            sum += 1 + nums[i];
            for(int j = 2;j<=Math.sqrt(nums[i]);j++) {
                if(nums[i]%j == 0) {
                    if(nums[i]/j == j) {
                        count++;
                        sum += j;
                    }
                    else{
                        count+=2;
                        sum+=j+nums[i]/j;
                    }
                }
            }
            if(count == 4) {
                res += sum;
                count = 2;
                sum = 0;
            }
            else {
                count = 2;
                sum = 0;
                continue;
            }
        }
        return res;
    }
}