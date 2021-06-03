package ro.fasttrackit.curs16.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeTest {
    @Test
    void testPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertThat(palindrome.isPalindrome(null)).isTrue();
        assertThat(palindrome.isPalindrome("")).isTrue();
        assertThat(palindrome.isPalindrome("a")).isTrue();
        assertThat(palindrome.isPalindrome("ana")).isTrue();
        assertThat(palindrome.isPalindrome("racecar")).isTrue();
        assertThat(palindrome.isPalindrome("cat")).isFalse();
        assertThat(palindrome.isPalindrome("racescar")).isFalse();
    }

}
