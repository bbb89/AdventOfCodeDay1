package com.lukasz;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your captcha:");
        String captcha = scanner.nextLine();
        int solution = Solution.sumOfCaptcha(captcha);
        System.out.println(solution);
    }
}
