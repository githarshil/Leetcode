class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i<=right;i++) {
            int count = 0;
            int digits = (int)(Math.log10(i)) + 1;
            int num = i;
            int n = i;
            while(n!=0) {
                int last= n%10;
                if(last == 0) {
                    break;
                }
                else if(num%last == 0) {
                    count++;
                }
                n = n/10;
            }
            if(count == digits) {
                res.add(num);
            }
        }
        return res;
    }
}