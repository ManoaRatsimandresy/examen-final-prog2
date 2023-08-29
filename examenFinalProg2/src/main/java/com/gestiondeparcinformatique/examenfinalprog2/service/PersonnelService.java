package com.gestiondeparcinformatique.examenfinalprog2.service;

import com.gestiondeparcinformatique.examenfinalprog2.model.Personnel;

import java.sql.SQLException;
import java.util.List;

public interface PersonnelService {
    void addPersonnel(Personnel personnel);

    Personnel findPersonnelById(int id);
    List<Personnel> findAllPersonnel() ;

    void updatePersonnel(Personnel personnel);
    void deletePersonnel(int id);

}

