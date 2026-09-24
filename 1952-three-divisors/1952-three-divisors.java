class Solution {
    public boolean isThree(int n) {
        int count  = 2;
        for(int i = 2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                if(n/i == i) {
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        if(count == 3) {
            return true;
        }
        return false;
    }
}