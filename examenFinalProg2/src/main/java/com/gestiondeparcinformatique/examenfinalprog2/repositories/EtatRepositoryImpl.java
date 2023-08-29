package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Etat;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EtatRepositoryImpl implements EtatRepository{
    private final Connection connection;


    public EtatRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Etat findStateById(int id) {

        return null;
    }

    @Override
    public List<Etat> findAllState() throws SQLException {
             List<Etat> etat = new ArrayList<>();
            String sql ="SELECT * FROM etat";
            try (Statement statement=this.connection.createStatement()){
                    ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                 Etat etats =new Etat();
                 etats.setIdEtats(resultSet.getInt("id"));
                 etats.setType_etats(resultSet.getString("type_etat"));
                 etats.setDescription(resultSet.getString("description_etat"));
            }
            }
            return etat;
    }

    @Override
    public void addState(Etat etat) throws SQLException {
        String sql = "INSERT INTO Client (type_etat, description_etat) VALUES (?, ?);";
        try(
                PreparedStatement statement = connection.getConnection().prepareStatement(sql);
        ){
            statement.setString(1, etat.getType_etats());
            statement.setString(2, etat.getDescription());
            statement.executeUpdate();
        }

    }

    @Override
    public void updateState(Etat etat , int id) throws SQLException {
        String sql = "UPDATE Client SET firstName = ?, lastName = ?, number = ? WHERE idClient = ? ;";
        try(
                PreparedStatement statement = connection.getConnection().prepareStatement(sql);
        ){
            statement.setString(1, etat.getType_etats());
            statement.setString(2, etat.getDescription());
            statement.setInt(4, id);
            statement.executeUpdate();
        }

    }


    @Override
    public void deleteState(int id) throws SQLException {
        String sql = "DELETE FROM Etat WHERE id = ?";
        try(
                PreparedStatement statement = connection.getConnection().prepareStatement(sql)
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
