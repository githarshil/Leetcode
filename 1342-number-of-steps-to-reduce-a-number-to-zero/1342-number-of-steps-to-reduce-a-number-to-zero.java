class Solution {
    public int numberOfSteps(int num) {
        return print(num);
    }
    static int print(int n) {
        if(n == 0){
            return 0;
        }
        else if(n%2 == 0){
            n = n/2;
            return print(n)+1;
        }
        else {
            if(n==1){
                return print(0)+1;
            }
            n = n-1;
            n = n/2;
            return print(n)+2;
        }
    }
}