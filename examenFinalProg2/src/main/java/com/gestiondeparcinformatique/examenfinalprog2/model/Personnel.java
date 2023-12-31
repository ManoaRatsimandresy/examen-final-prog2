package com.gestiondeparcinformatique.examenfinalprog2.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Personnel {
    private int idPersonnel;

    private String nomPersonnel;

    private String fonction;
}

