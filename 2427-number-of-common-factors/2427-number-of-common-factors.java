class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        if(a>b)
            for(int i = 2;i<=a;i++) {
                if(a%i == 0 && b%i == 0) {
                    count++;
                }
            }
        else{
            for(int i = 2;i<=b;i++) {
                if(a%i == 0 && b%i == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}