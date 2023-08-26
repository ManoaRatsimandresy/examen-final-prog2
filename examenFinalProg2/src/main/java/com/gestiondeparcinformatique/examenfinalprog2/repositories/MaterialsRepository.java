package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.materials;

import java.util.List;

public interface MaterialsRepository {
    materials findById(int id);
    List<materials> findAll();
    void add(materials materials);
    void update(materials materials);
    void delete(int id);
}
