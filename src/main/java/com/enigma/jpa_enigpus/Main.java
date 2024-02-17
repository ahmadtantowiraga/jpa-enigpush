package com.enigma.jpa_enigpus;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa-enigpus");
        EntityManager em=emf.createEntityManager();

        em.close();
        emf.close();
    }
}
