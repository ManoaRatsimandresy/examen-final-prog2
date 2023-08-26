package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Personnel;

import java.util.List;

public interface PersonnelRepositories {
    Personnel findById(int id);
    List<Personnel> findAll();
    void add(Personnel personnel);
    void update(Personnel produit);
    void delete(int id);
}
