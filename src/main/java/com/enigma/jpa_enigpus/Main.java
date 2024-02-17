package com.enigma.jpa_enigpus;

import com.enigma.jpa_enigpus.entity.Novel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa-enigpus");
        EntityManager em=emf.createEntityManager();
        em.persist(new Novel());
        em.close();
        emf.close();
    }
}
