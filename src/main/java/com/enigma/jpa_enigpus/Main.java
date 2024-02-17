package com.enigma.jpa_enigpus;


import com.enigma.jpa_enigpus.entity.Novel;
import com.enigma.jpa_enigpus.util.JpaUtil;
import com.enigma.jpa_enigpus.view.MenuView;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager= JpaUtil.getEntityManager();
        MenuView menu=new MenuView(entityManager);
        menu.run();
        entityManager.close();
        JpaUtil.shutdown();
    }
}
