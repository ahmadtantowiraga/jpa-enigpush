package com.enigma.jpa_enigpus.repository;

import com.enigma.jpa_enigpus.entity.Novel;

import java.util.List;

public interface NovelRepository {
    void save(Novel novel);
    List<Novel> getAllBook();
}
