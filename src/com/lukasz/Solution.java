package com.lukasz;

public class Solution {

    public static int sumOfCaptcha(String captcha) {

        int digits[] = fillTableOfDigits(captcha);
        int sum = sumDigits(digits, captcha);

        return sum;
    }

    private static int[] fillTableOfDigits(String captcha) {
        int digits[] = new int[captcha.length()];

        for(int i = 0; i < captcha.length(); i++) {
            digits[i] = Character.getNumericValue(captcha.charAt(i));
        }

        return digits;
    }

    private static int sumDigits(int[] digits, String captcha) {
        int sum = 0;
        sum += sumDigitsFromFirstToLast(digits, captcha);
        sum += sumFirstAndLastDigit(digits, captcha);

        return sum;
    }

    private static int sumDigitsFromFirstToLast(int[] digits, String captcha) {
        int result = 0;
        for(int i = 0; i < captcha.length() - 1; i++) {
            if(digits[i] == digits[i+1]) {
                result += digits[i];
            }
        }
        return result;
    }

    private static int sumFirstAndLastDigit(int[] digits, String captcha) {
        int result = 0;
        if(captcha.length() > 0 && digits[0] == digits[captcha.length() - 1]) {
            result += digits[0];
        }
        return result;
    }
}
