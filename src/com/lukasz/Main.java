package com.lukasz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your captcha:");
        int captcha = scanner.nextInt();
        int solution = Solution.sumOfCaptcha(captcha);
        System.out.println(solution);
    }
}
