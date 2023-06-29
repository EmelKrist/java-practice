package easy;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for (char l : ransomNote.toCharArray()) {
            int idxOfLetter = sb.toString().indexOf(l);
            if (idxOfLetter == -1) return false;
            sb.setCharAt(idxOfLetter, ' ');
        }
        return true;
    }

    public boolean canConstructAlter(String ransomNote, String magazine) {
        if  (ransomNote.length() > magazine.length()) return false;
        int[] letters = new int[26];

        for (char c : magazine.toCharArray()) {
            letters[c-'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letters[c-'a'] == 0) return false;
            letters[c-'a']--;
        }

        return true;
    }
}
