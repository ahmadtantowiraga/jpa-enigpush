package com.enigma.jpa_enigpus;


import com.enigma.jpa_enigpus.entity.Novel;
import com.enigma.jpa_enigpus.view.MenuView;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MenuView menu=new MenuView();
        menu.run();
//        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa-enigpus");
//        EntityManager em=emf.createEntityManager();
//        EntityTransaction transaction=em.getTransaction();
//        transaction.begin();
////        em.persist(new Novel(null,"author","title",2023,"publisher"));
////        em.remove(em.find(Novel.class,1));
//        transaction.commit();
//        em.close();
//        emf.close();
    }
}
