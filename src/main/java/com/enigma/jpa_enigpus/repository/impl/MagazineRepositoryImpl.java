package com.enigma.jpa_enigpus.repository.impl;

import com.enigma.jpa_enigpus.entity.Magazine;
import com.enigma.jpa_enigpus.entity.Novel;
import com.enigma.jpa_enigpus.repository.MagazineRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

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
    @Override
    public List<Magazine> getAllBook() {
        return entityManager.createQuery("FROM Magazine", Magazine.class).getResultList();
    }
    @Override
    public List<Magazine> findByName(String title) {
        List<Magazine> magazineList=entityManager.createQuery("FROM Magazine", Magazine.class).getResultList();
        return magazineList.stream().filter(magazine -> magazine.getTitle().toLowerCase().equals(title.toLowerCase())).toList();
    }

    @Override
    public Magazine findById(Integer id) {
        return entityManager.find(Magazine.class, id);
    }

    @Override
    public void update(Magazine magazine) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(magazine);
        transaction.commit();
    }
}
