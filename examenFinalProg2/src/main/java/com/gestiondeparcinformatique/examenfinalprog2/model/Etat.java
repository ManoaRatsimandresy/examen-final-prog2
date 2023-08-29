package com.gestiondeparcinformatique.examenfinalprog2.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Etat {

    private int idEtats;

    private String type_etats;

    private String Description;
}
