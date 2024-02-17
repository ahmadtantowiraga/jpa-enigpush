package com.enigma.jpa_enigpus.util;

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
                System.out.println("Press ENTER to continue");
                Utility.inputUtil("");
            } else {
                return menu;
            }
        }
    }
}
