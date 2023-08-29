package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Personnel;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonnelRepositoryImpl implements PersonnelRepositories{
        private final Connection connection;

        public PersonnelRepositoryImpl(Connection connection) {
                this.connection = connection;
        }


        @Override
        public Personnel findPersonnelById(int id) throws SQLException {
            List<Personnel> personnelByID = new ArrayList<>();
            String sql = "SELECT * FROM personnel Where id=?;";
            try (Statement statement=this.connection.createStatement()){
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    Personnel personnel =new Personnel();
                    personnel.setIdPersonnel(resultSet.getInt("id"));

                }
            }
            return (Personnel) personnelByID;
        }

        @Override
        public List<Personnel> findAllPersonnel() throws SQLException {
            List<Personnel> personnels = new ArrayList<>();
            String sql = "SELECT * FROM personnel";
            try (Statement statement=this.connection.createStatement()){
                    ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                 Personnel personnel =new Personnel();
                 personnel.setIdPersonnel(resultSet.getInt("id"));
                 personnel.setNomPersonnel(resultSet.getString("nom_personnel"));
                 personnel.setFonction(resultSet.getString("fonction"));
            }
            }
            return personnels;
        }

        @Override
        public void addPersonnel(Personnel personnel) throws SQLException {
            String sql = "INSERT INTO Client (nom_personnel, fonction) VALUES (?, ?)";
            try(
                    PreparedStatement statement = connection.getConnection().prepareStatement(sql);
            ){
                statement.setString(1, personnel.getNomPersonnel());
                statement.setString(2, personnel.getFonction());
                statement.executeUpdate();
            }


        }

        @Override
        public void updatePersonnel(Personnel personnel) throws SQLException {
            String sql = "UPDATE Personnel SET nom_personnel = ?, Fonction = ?, WHERE id = ?";
            try(
                    PreparedStatement statement = connection.getConnection().prepareStatement(sql);
            ){
                statement.setString(1, personnel.getNomPersonnel());
                statement.setString(2, personnel.getFonction());
                statement.setInt(4,personnel.getIdPersonnel());
                statement.executeUpdate();
            }

        }

        @Override
        public void deletePersonnel(int id) throws SQLException {
            String sql = "DELETE FROM Personnel WHERE id = ?";
            try(
                    PreparedStatement statement = connection.getConnection().prepareStatement(sql)
            ) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }

        }
    }
