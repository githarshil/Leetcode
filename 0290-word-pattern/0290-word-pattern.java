class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        if (pattern.length() - 1 == words.length - 1) {
            for (int i = 0; i < pattern.length(); i++) {
                char x = pattern.charAt(i);
                String word = words[i];
                if (map1.containsKey(x) && !map1.get(x).equals(word)) {
                    return false;
                }
                if (map2.containsKey(word) && map2.get(word) != x) {
                    return false;
                }
                map1.put(x, word);
                map2.put(word, x);
            }
        return true;
        }
        return false;
    }
}