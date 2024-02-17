package com.enigma.jpa_enigpus.repository.impl;

import com.enigma.jpa_enigpus.entity.Magazine;
import com.enigma.jpa_enigpus.repository.MagazineRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MagazineRepositoryImpl implements MagazineRepository {
    private final EntityManager entityManager;

    public MagazineRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Magazine magazine) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(magazine);
        transaction.commit();
    }
}
