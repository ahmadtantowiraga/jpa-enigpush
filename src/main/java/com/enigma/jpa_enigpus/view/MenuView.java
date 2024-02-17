package com.enigma.jpa_enigpus.view;

import com.enigma.jpa_enigpus.util.Utility;

public class MenuView {
    public  void run(){
        showMenu();
    }
    private void showMenu(){
        while (true) {
            System.out.println("-".repeat(30));
            System.out.println("Main Menu");
            System.out.println("-".repeat(30));
            System.out.println("1. Add Book");
            System.out.println("2. Get All Book");
            System.out.println("3. Search Book By Title");
            System.out.println("4. Update Book By id");
            System.out.println("5. Delete Book");
            System.out.println("6. EXIT");
            int menu=Utility.inputMenuOption();
            if (menu==6){
                break;
            }else {
                switch (menu) {
                    case 1:
                        addbook();
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

    private void addbook(){
        System.out.println("1. Add ");
        System.out.println("2. Get All Book");
    }

}
