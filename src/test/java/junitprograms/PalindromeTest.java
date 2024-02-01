package junitprograms;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void Test1(){

        assertTrue(Palindrome.checkIntegerPalindrome(121));
    }
    @Test
    public void testPalindromeWithEvenDigits() {
        assertTrue(Palindrome.checkIntegerPalindrome(1221));
    }

    @Test
    public void testPalindromeWithOddDigits() {
        assertTrue(Palindrome.checkIntegerPalindrome(12321));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.checkIntegerPalindrome(12345));
    }

    @Test
    public void testSingleDigitPalindrome() {
        assertTrue(Palindrome.checkIntegerPalindrome(7));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(Palindrome.checkIntegerPalindrome(-121));
    }

    @Test
    public void testZero() {
        assertTrue(Palindrome.checkIntegerPalindrome(0));
    }

}