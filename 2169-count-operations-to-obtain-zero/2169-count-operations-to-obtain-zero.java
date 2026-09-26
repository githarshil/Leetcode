class Solution {
    public int countOperations(int num1, int num2) {
        return print(num1,num2);
    }
    static int print(int num1,int num2) {
        if(num1==0 || num2 == 0) {
            return 0;
        }
        else if(num1>num2) {
            num1 -= num2;
            return print(num1,num2) + 1;
        }
        else {
            num2 -= num1;
            return print(num1,num2) + 1;
        }
    }
}