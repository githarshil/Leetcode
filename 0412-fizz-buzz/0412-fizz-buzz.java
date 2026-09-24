class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        answer.add("1");
        for(int i = 2;i<=n;i++) {
            
            if(i%3 == 0 && i%5 == 0) {
                answer.add("FizzBuzz");
            }
            else if(i%3 == 0) {
                answer.add("Fizz");
            }
            else if(i % 5 == 0) {
                answer.add("Buzz");
            }
            else {
                String num = Integer.toString(i);
                answer.add(num);
            }
        }
        return answer;
    }
}