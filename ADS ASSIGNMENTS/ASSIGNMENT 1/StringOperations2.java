import java.util.*;

public class StringOperations2 {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;
        for (char c : s2.toCharArray()) count[c - 'a']--;

        for (int c : count) if (c != 0) return false;
        return true;
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static int[] countVowelsAndConsonants(String sentence) {
        int vowels = 0, consonants = 0;
        String lower = sentence.toLowerCase();
        for (char c : lower.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        String sentence = "Practice makes a man perfect";

        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + areAnagrams(s1, s2));
        System.out.println("Longest word: " + findLongestWord(sentence));

        int[] counts = countVowelsAndConsonants(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }
}
