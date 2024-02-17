package com.enigma.jpa_enigpus.repository.impl;

import com.enigma.jpa_enigpus.entity.Novel;
import com.enigma.jpa_enigpus.repository.NovelRepository;
import com.enigma.jpa_enigpus.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class NovelRepositoryImpl implements NovelRepository {
    private final EntityManager entityManager;

    public NovelRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Novel novel) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(novel);
        transaction.commit();
    }

    @Override
    public List<Novel> getAllBook() {
        return entityManager.createQuery("FROM Novel",Novel.class).getResultList();
    }

    @Override
    public List<Novel> findByName(String title) {
        List<Novel> novelList=entityManager.createQuery("FROM Novel",Novel.class).getResultList();
        return novelList.stream().filter(novel -> novel.getTitle().toLowerCase().equals(title.toLowerCase())).toList();
    }

    @Override
    public void update(Novel novel) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(novel);
        transaction.commit();
    }

    @Override
    public Novel findById(Integer id) {
        return entityManager.find(Novel.class,id);
    }

    @Override
    public void delete(Novel novel) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();;
        entityManager.remove(novel);
        transaction.commit();
    }
}
