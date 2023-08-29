package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Personnel;

import java.sql.SQLException;
import java.util.List;

public interface PersonnelRepositories {
    Personnel findPersonnelById(int id) throws SQLException;
    List<Personnel> findAllPersonnel() throws SQLException;
    void addPersonnel(Personnel personnel) throws SQLException;
    void updatePersonnel(Personnel personnel) throws SQLException;
    void deletePersonnel(int id) throws SQLException;
}
