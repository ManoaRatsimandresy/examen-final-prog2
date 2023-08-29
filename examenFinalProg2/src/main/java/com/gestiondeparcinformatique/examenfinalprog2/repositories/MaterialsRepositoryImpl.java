package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Materials;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaterialsRepositoryImpl implements MaterialsRepository{
    private final Connection connection;


    public MaterialsRepositoryImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public Materials findByMaterialsId(int id) {
        return null;
    }

    @Override
    public List<Materials> findAllMaterials() throws SQLException {
         List<Materials> materials = new ArrayList<>();
            String sql ="SELECT * FROM materials";
            try (Statement statement=this.connection.createStatement()){
                    ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Materials material = new Materials();
                material.setIdMaterials(resultSet.getInt("id"));
                 material.setTypeMaterials(resultSet.getString("type_materials"));
            }
            }
            return materials;
    }

    @Override
    public void addMaterials(Materials materials) throws SQLException {
        String sql = "INSERT INTO Client (type_materials) VALUES (?)";
        try(
                PreparedStatement statement = connection.getConnection().prepareStatement(sql);
        ){
            statement.setString(3, materials.getTypeMaterials());
            statement.executeUpdate();
        }

    }

    @Override
    public void updateMaterials(Materials materials , int id) throws SQLException {
        String sql = "UPDATE Client SET  type_materials = ?,  WHERE idClient = ?";
        try(
                PreparedStatement statement = connection.getConnection().prepareStatement(sql);
        ){
            statement.setString(1, materials.getTypeMaterials());
            statement.setInt(4, id);
            statement.executeUpdate();
        }


    }

    @Override
    public void deleteMaterials(int id) throws SQLException {
        String sql = "DELETE FROM materials WHERE id = ?";
        try(
                PreparedStatement statement = connection.getConnection().prepareStatement(sql)
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
