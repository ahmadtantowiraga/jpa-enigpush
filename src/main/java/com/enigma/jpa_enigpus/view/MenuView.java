package com.enigma.jpa_enigpus.view;

import com.enigma.jpa_enigpus.entity.Magazine;
import com.enigma.jpa_enigpus.entity.Novel;
import com.enigma.jpa_enigpus.entity.PeriodType;
import com.enigma.jpa_enigpus.repository.MagazineRepository;
import com.enigma.jpa_enigpus.repository.NovelRepository;
import com.enigma.jpa_enigpus.repository.impl.MagazineRepositoryImpl;
import com.enigma.jpa_enigpus.repository.impl.NovelRepositoryImpl;
import com.enigma.jpa_enigpus.util.JpaUtil;
import com.enigma.jpa_enigpus.util.Utility;
import jakarta.persistence.EntityManager;

public class MenuView {
    private final NovelRepository novelRepository;
    private final MagazineRepository magazineRepository;

    public MenuView(EntityManager entityManager) {
        this.novelRepository = new NovelRepositoryImpl(entityManager);
        this.magazineRepository=new MagazineRepositoryImpl(entityManager);
    }

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
        System.out.println("1. Add Novel");
        System.out.println("2. Add Magazine");
        int book=Utility.inputBookOption();
        if (book==1){
            String author = Utility.minMaxWord(Utility.inputUtil("Input author name :"));
            String title=Utility.minMaxWord(Utility.inputUtil("Input Title : "));
            Integer year=Utility.inputIntUtil("Input Year : ");
            String publisher=Utility.minMaxWord(Utility.inputUtil("Input Publisher : "));
            Novel novel=new Novel(null, author,title,year,publisher);
            novelRepository.save(novel);
        }else{
            String title=Utility.minMaxWord(Utility.inputUtil("Input Title : "));
            Integer year=Utility.inputIntUtil("Input Year : ");
            PeriodType period=Utility.inputPeriodType();
            Magazine magazine=new Magazine(null, title,year,period);
            magazineRepository.save(magazine);
        }

    }

}
