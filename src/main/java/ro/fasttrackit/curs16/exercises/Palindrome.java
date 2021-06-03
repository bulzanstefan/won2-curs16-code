package ro.fasttrackit.curs16.exercises;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word == null || word.length() < 2) {
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        } else {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
    }
}
