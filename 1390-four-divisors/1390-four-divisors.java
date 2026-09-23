class Solution {
    public int sumFourDivisors(int[] nums) {
        int count = 2;
        int sum = 0;
        int res = 0;
        for(int i = 0;i<nums.length;i++) {
            sum += 1 + nums[i];
            double root = Math.sqrt(nums[i]);
            for(int j = 2;j<=root;j++) {
                if(nums[i]%j == 0) {
                    if(nums[i]/j == j) {
                        count++;
                        sum += j;
                        if(count>4) {
                            break;
                        }
                    }
                    else{
                        count+=2;
                        sum+=j+nums[i]/j;
                        if(count>4) {
                            break;
                        }
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