package com.gestiondeparcinformatique.examenfinalprog2.service;

import com.gestiondeparcinformatique.examenfinalprog2.model.Personnel;
import com.gestiondeparcinformatique.examenfinalprog2.repositories.PersonnelRepositoryImpl;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Service
public class PersonnelServiceImpl implements PersonnelService{

private PersonnelRepositoryImpl DAO;

    public PersonnelServiceImpl(PersonnelRepositoryImpl DAO) {
        this.DAO = DAO;
    }

    @Override
    public void addPersonnel(Personnel personnel) {

    }

    @Override
    public Personnel findPersonnelById(int id) {
        return null;
    }

    @Override
    public List<Personnel> findAllPersonnel() {
        try {
            return this.DAO.findAllPersonnel();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePersonnel(Personnel personnel) {

    }

    @Override
    public void deletePersonnel(int id) {

    }
}
