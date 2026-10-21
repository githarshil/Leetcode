class Solution {
    public boolean isHappy(int n) {
    //    int slow = n;
    //    int fast = n;
    //    do {
    //     slow = findSquare(slow);
    //     fast = findSquare(findSquare(fast));
    //    } while(slow!=fast);
    //    if(slow == 1){
    //     return true;
    //    }
    //    return false;
    Set<Integer> set = new HashSet<>();
    while(n!=1) {
        if(set.contains(n)) {
            return false;
        }
        set.add(n);
        n = findSquare(n);
    }
    return true;
    }
    public int findSquare(int n) {
        int sum = 0;
        while(n != 0) {
            int last = n%10;
            sum += last*last;
            n = n/10;
        }
        return sum;
    }
}