package com.bmi;

import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in KG: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height CM: ");
        height = sc.nextDouble();
        bmi = (weight / (height * height)) * 10000.0;
        if (bmi < 18.5) {
            System.out.printf("Your BMI is %.2f",bmi);
            System.out.println(". You are underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("Your BMI is %.2f",bmi);
            System.out.println(". You are normal");
        } else {
            System.out.printf("Your BMI is %.2f",bmi);
            System.out.println(". You are overweight");
        }

    }
}













