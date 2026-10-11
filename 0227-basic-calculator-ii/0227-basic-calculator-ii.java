class Solution {
    public int calculate(String s) {
        Deque <Integer> st = new ArrayDeque<>();
        int num = 0;
        char lastOp = '+';
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                num = num*10 + (ch-'0');
            }
            if((!Character.isDigit(ch) &&ch != ' ') || i == s.length() -1){
                if(lastOp == '+') {st.push(num);}
                else if(lastOp == '-') {st.push(-num);}
                else if(lastOp == '*') {st.push(st.pop() * num);}
                else if(lastOp == '/') {st.push(st.pop() / num);}
            lastOp = ch;
            num = 0;
            }
        }
        int ans = 0;
        while(!st.isEmpty()) {
            ans+=st.pop();
        }
        return ans;
    }
}