import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {

    }

    public static boolean checkAnagrams(String word1, String word2) {
        HashMap<Character, Integer> charCount1 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for (char c : word2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }

        return charCount1.equals(charCount2);
    }
}
