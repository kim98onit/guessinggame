package com.kim.loops;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Welcome To Wonderland");
        System.out.println("Pleas Enter Your Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+ name);

        System.out.println("Shall We Start ?");
        System.out.println("\t1. YES");
        System.out.println("\t2. NO");

        int beginAnswer = scanner. nextInt();

        while ( beginAnswer!= 1){
            System.out.println("Shall We Start ?");
            System.out.println("\t1. YES");
            System.out.println("\t2. NO");

            beginAnswer = scanner.nextInt();


        }

        Random random = new Random();
        int x = random.nextInt(20) +1;
        System.out.println("Please Guess A Number: ");
        int userInput = scanner.nextInt();

        int timestried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish){
            timestried++;

            if (timestried < 5){
                if (userInput == x){
                    hasWon= true;
                    shouldFinish = true;
                } else if (userInput > x) {
                    System.out.println("Guess Lower");

                    userInput = scanner.nextInt();

                }else {
                    System.out.println("Guess Higher");

                    userInput = scanner.nextInt();
                }
            }else {
                shouldFinish = true;

            }
        }
        if (hasWon){
            System.out.println("CONGRATULATION! " );
        }
    }
}
