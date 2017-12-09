package com.lukasz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sumOfCaptcha_forZero() {
        int actual = Solution.sumOfCaptcha("0");
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void sumOfCaptcha_forOneDigit() {
        int actual = Solution.sumOfCaptcha("1");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void sumOfCaptcha_forNumbers1() {
        int actual = Solution.sumOfCaptcha("91212129");
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void sumOfCaptcha_forNumbers2() {
        int actual = Solution.sumOfCaptcha("1111");
        int expected = 4;

        assertEquals(expected, actual);
    }
    @Test
    void sumOfCaptcha_forNumbers3() {
        int actual = Solution.sumOfCaptcha("1234");
        int expected = 0;

        assertEquals(expected, actual);
    }
}