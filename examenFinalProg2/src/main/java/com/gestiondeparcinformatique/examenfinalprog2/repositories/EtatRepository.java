package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Etat;


import java.sql.SQLException;
import java.util.List;

public interface EtatRepository {
    Etat findStateById(int id);
    List<Etat> findAllState() throws SQLException;
    void addState(Etat etat) throws SQLException;



    void updateState(Etat etat, int id) throws SQLException;

    void deleteState(int id) throws SQLException;
}
