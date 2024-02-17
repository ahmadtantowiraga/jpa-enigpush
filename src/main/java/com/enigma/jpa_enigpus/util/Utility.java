package com.enigma.jpa_enigpus.util;

import com.enigma.jpa_enigpus.entity.PeriodType;

import java.util.Scanner;

public class Utility {
    public static String inputUtil(String info) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("%s", info);
            String result = scanner.nextLine();
            if (result.isEmpty() || result.isBlank()) {
                continue;
            }
            return result;
        }
    }

    public static Integer inputIntUtil(String info) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("%s", info);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println();
                System.out.println("ONLY INPUT NUMBERS");
                System.out.println();
                continue;

            }
        }
    }
    public static int inputMenuOption(){
        while(true) {
            Integer menu = inputIntUtil("Input menu Option (1-6) : ");
            if (menu < 1 || menu > 6) {
                System.out.println("Enter the correct MENU NO (number 1-6)");
            } else {
                return menu;
            }
        }
    }

    public static int inputBookOption(){
        while(true) {
            Integer menu = inputIntUtil("Select one ( 1 or 2) to continue: ");
            if (menu < 1 || menu > 2) {
                System.out.println("Enter the correct 1 or 2");
            } else {
                return menu;
            }
        }
    }
    public static String minMaxWord(String word){
        while(true){
            if (word.length() < 3 || word.length() > 50){
                word=inputUtil("Input 3 to 50 letters : ");
            }else{
                return word;
            }
        }
    }
    public static PeriodType inputPeriodType(){
        System.out.println("Input Period :");
        System.out.println("1. WEEKLY");
        System.out.println("2. MONTHLY");
        while(true){
            int coice=inputIntUtil("Select 1 or 2 :");
            if (coice < 1 || coice > 2){
                System.out.println("The input is wrong");
            }else if (coice ==1){
                return PeriodType.WEEKLY;
            }else{
                return PeriodType.MONTHLY;
            }
        }
    }
}
