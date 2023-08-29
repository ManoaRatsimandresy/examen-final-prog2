package com.gestiondeparcinformatique.examenfinalprog2.repositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Configuration
public class DatabaseConfig {


   @Bean
    public Connection getConnection() throws SQLException{
       return DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/gestion_parc_informatique",
               "postgres",
               "123KyrieIrving"
       );
   }

}
