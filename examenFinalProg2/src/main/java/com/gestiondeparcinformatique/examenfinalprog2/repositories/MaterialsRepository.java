package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import com.gestiondeparcinformatique.examenfinalprog2.model.Materials;


import java.sql.SQLException;
import java.util.List;

public interface MaterialsRepository {
    Materials findByMaterialsId(int id);
    List<Materials> findAllMaterials() throws SQLException;
    void addMaterials(Materials materials) throws SQLException;
    void updateMaterials(Materials materials) throws SQLException;
    void deleteMaterials(int id) throws SQLException;
}
