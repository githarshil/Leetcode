class Solution {
    public boolean backspaceCompare(String s, String t) {
        String res1 = back(s);
        String res2 = back(t);
        return res1.equals(res2);
    }
    public String back(String s) {
        Deque <Character> st = new ArrayDeque<>();
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == '#') {
                st.pop();
            }
            else if(st.isEmpty() && ch == '#') {
                continue;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
            
        }
        return sb.reverse().toString();
    }
}