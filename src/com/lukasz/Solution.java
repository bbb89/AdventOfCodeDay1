package com.lukasz;

public class Solution {

    public static int sumOfCaptcha(int captcha) {
        int sum = 0;
        int numberOfDigits = 0;
        int copyOfCaptcha = captcha;

        while (copyOfCaptcha > 0) {
            numberOfDigits++;
            copyOfCaptcha /= 10;
        }

        int digits[] = new int[numberOfDigits];

        for(int i = 0; captcha > 0; i++) {
            digits[numberOfDigits - 1 - i] = captcha % 10;
            captcha /= 10;
        }


        for(int i = 0; i < numberOfDigits - 1; i++) {
            if(digits[i] == digits[i+1]) {
                sum += digits[i];
            }
        }

        //There is no explanation what to do if captcha is just one digit like "1".
        //I think it should by added to sum because it's circular
        if(numberOfDigits > 0 && digits[0] == digits[numberOfDigits - 1]) {
            sum += digits[0];
        }

        return sum;
    }
}
