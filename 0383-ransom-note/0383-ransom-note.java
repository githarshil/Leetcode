class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqr = new int[26];
        for(char c: ransomNote.toCharArray()) {
            freqr[c-'a']++;
        }
        int[] freqm = new int[26];
        for(char c: magazine.toCharArray()) {
            freqm[c-'a']++;
        }
        for(int i = 0;i<ransomNote.length();i++) {
            if(freqr[ransomNote.charAt(i)-'a'] > freqm[ransomNote.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}