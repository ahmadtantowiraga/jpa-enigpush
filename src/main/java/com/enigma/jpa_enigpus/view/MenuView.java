package com.enigma.jpa_enigpus.view;

import com.enigma.jpa_enigpus.util.Utility;

public class MenuView {

    public void showMenu(){
        while (true) {
            Integer Menu=null;
            while(true){
                System.out.println("-".repeat(30));
                System.out.println("Main Menu");
                System.out.println("-".repeat(30));
                System.out.println("1. Add Book");
                System.out.println("2. Get All Book");
                System.out.println("3. Search Book By Title");
                System.out.println("4. Update Book By id");
                System.out.println("5. Delete Book");
                System.out.println("6. EXIT");
                Menu = Utility.inputIntUtil("Input menu Option (1-6) : ");
                if (Menu < 1 || Menu > 6) {
                    System.out.println("Enter the correct MENU NO (number 1-6)");
                    System.out.println("Press ENTER to continue");
                    Utility.inputUtil("");
                }else{
                    break;
                }
            }

            if (Menu==6){
                break;
            }else {
                switch (Menu) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;

                }
            }
        }
    }



}
