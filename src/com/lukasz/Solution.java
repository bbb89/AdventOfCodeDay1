package com.lukasz;

public class Solution {

    public static int sumOfCaptcha(String captcha) {
        int sum = 0;
        String copyOfCaptcha = captcha;

        int digits[] = new int[captcha.length()];

        for(int i = 0; i < captcha.length(); i++) {
            digits[i] = Character.getNumericValue(captcha.charAt(i));
        }


        for(int i = 0; i < captcha.length() - 1; i++) {
            if(digits[i] == digits[i+1]) {
                sum += digits[i];
            }
        }

        //There is no explanation what to do if captcha is just one digit like "1".
        //I think it should by added to sum because it's circular
        if(captcha.length() > 0 && digits[0] == digits[captcha.length() - 1]) {
            sum += digits[0];
        }

        return sum;
    }
}
