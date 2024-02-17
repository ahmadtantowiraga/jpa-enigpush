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

import java.util.List;

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
                        addBook();
                        break;
                    case 2:
                        getAllBook();
                        break;
                    case 3:
                        findByName();
                        break;
                    case 4:
                        updateBookById();
                        break;
                    case 5:

                        break;
                }
            }
        }
    }

    private void addBook(){
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
    private void getAllBook(){
        System.out.println("Novel List :");
        novelRepository.getAllBook().stream().forEach(novel -> {
            System.out.println("id         : " + novel.getId());
            System.out.println("Author     : " + novel.getAuthor());
            System.out.println("Title      : " + novel.getTitle());
            System.out.println("Year       : " + novel.getYear());
            System.out.println("Publisher  : " + novel.getPublisher());
            System.out.println();
        });
        System.out.println("Magazine List :");
        magazineRepository.getAllBook().stream().forEach(magazine -> {
            System.out.println("id         : " + magazine.getId());
            System.out.println("Title      : " + magazine.getTitle());
            System.out.println("Year       : " + magazine.getYear());
            System.out.println("Period     : " + magazine.getPeriod());
            System.out.println();
        });
    }
    private void findByName(){
        System.out.println("1. Add Novel");
        System.out.println("2. Add Magazine");
        int book=Utility.inputBookOption();
        if (book==1){
            String name=Utility.inputUtil("Input the title for find Novel : ");
            novelRepository.findByName(name).stream().forEach(novel -> {
                System.out.println("id         : " + novel.getId());
                System.out.println("Author     : " + novel.getAuthor());
                System.out.println("Title      : " + novel.getTitle());
                System.out.println("Year       : " + novel.getYear());
                System.out.println("Publisher  : " + novel.getPublisher());
                System.out.println();
            });
        }else{
            String name=Utility.inputUtil("Input the title for find Magazine : ");
            magazineRepository.findByName(name).stream().forEach(magazine -> {
                System.out.println("id         : " + magazine.getId());
                System.out.println("Title      : " + magazine.getTitle());
                System.out.println("Year       : " + magazine.getYear());
                System.out.println("Period     : " + magazine.getPeriod());
                System.out.println();
            });
        }
    }
    private void updateBookById(){
        System.out.println("1. Add Novel");
        System.out.println("2. Add Magazine");
        int book=Utility.inputBookOption();
        if (book==1){
            Integer id=Utility.inputIntUtil("Input the id for find Novel : ");
            Novel novel=novelRepository.findById(id);
            if (novel == null){
                System.out.println("id Not Found\n");
            }else{
                novel.setAuthor(Utility.minMaxWord(Utility.inputUtil("Input author name :")));
                novel.setTitle(Utility.minMaxWord(Utility.inputUtil("Input Title : ")));
                novel.setYear(Utility.inputIntUtil("Input Year : "));
                novel.setPublisher(Utility.minMaxWord(Utility.inputUtil("Input Publisher : ")));
                novelRepository.update(novel);
            }
        }else{
            Integer id=Utility.inputIntUtil("Input the id for find Magazine : ");
            Magazine magazine=magazineRepository.findById(id);
            if (magazine==null){
                System.out.println("id Not Found\n");
            }else{
                magazine.setPeriod(Utility.inputPeriodType().name());
                magazine.setTitle(Utility.minMaxWord(Utility.inputUtil("Input Title : ")));
                magazine.setYear(Utility.inputIntUtil("Input Year : "));
                magazineRepository.update(magazine);
            }
        }
    }

}
