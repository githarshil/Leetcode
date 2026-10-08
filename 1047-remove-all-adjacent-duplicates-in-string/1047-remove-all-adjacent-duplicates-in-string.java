class Solution {
    public String removeDuplicates(String s) {
        Deque <Character> st = new ArrayDeque<>();
        String res = "";
        for(int  i = 0;i<s.length();i++) {
            if(st.isEmpty()) {
            st.push(s.charAt(i));
            continue;
            }
            if(s.charAt(i) == st.peek()) {
                st.pop();
                continue;    
            } 
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()) {
            res += st.peek();
            st.pop();
        }
        return reverse(res);
        
    }
    public String reverse(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;
    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    return new String(arr);
}
}