class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            } else if (arr[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    arr[i] = '*';
                }
            }
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = '*';
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : arr) {
            if (ch != '*') {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}