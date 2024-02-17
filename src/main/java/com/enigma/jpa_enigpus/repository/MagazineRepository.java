package com.enigma.jpa_enigpus.repository;

import com.enigma.jpa_enigpus.entity.Magazine;

import java.util.List;

public interface MagazineRepository {
    void save(Magazine magazine);
    List<Magazine> getAllBook();
    List<Magazine> findByName(String title);
    Magazine findById(Integer id);
    void update(Magazine magazine);
    void delete(Magazine magazine);
}
