class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i  = 0;
        while(i<command.length()) {
            if(command.charAt(i) == 'G'){
            sb.append('G');
            i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                sb.append('o');
                i+=2;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                sb.append("al");
                i+=4;
            }
        }
        return sb.toString();
        // String str = command.replace("()","o");
        // String str2 = str.replace("(al)","al");
        // return str2;
    }
}