-- Création de la table Materiel
-- Table: Personnel
------------------------------------------------------------
CREATE TABLE Personnel(
	id              SERIAL NOT NULL ,
	nom_personnel   VARCHAR (200)  ,
	fonction        VARCHAR (200) NOT NULL  ,
	CONSTRAINT Personnel_PK PRIMARY KEY (id)
);


------------------------------------------------------------
-- Table: etat
------------------------------------------------------------
CREATE TABLE etat(
	id                 SERIAL NOT NULL ,
	type_etat          VARCHAR (200) NOT NULL ,
	description_etat   VARCHAR (2000)  NOT NULL  ,
	CONSTRAINT etat_PK PRIMARY KEY (id)
);


------------------------------------------------------------
-- Table: materials
------------------------------------------------------------
CREATE TABLE materials(
	id               SERIAL NOT NULL ,
	type_materials   VARCHAR (200) NOT NULL ,
	id_etat          INT  NOT NULL  ,
	CONSTRAINT materials_PK PRIMARY KEY (id)

	,CONSTRAINT materials_etat_FK FOREIGN KEY (id_etat) REFERENCES etat(id)
);


------------------------------------------------------------
-- Table: utilisation
------------------------------------------------------------
CREATE TABLE utilisation(
	id             INT  NOT NULL ,
	id_Personnel   INT  NOT NULL ,
	date_debut     TIMESTAMP   ,
	date_fin       TIMESTAMP    ,
	CONSTRAINT utilisation_PK PRIMARY KEY (id,id_Personnel)

	,CONSTRAINT utilisation_materials_FK FOREIGN KEY (id) REFERENCES materials(id)
	,CONSTRAINT utilisation_Personnel0_FK FOREIGN KEY (id_Personnel) REFERENCES Personnel(id)
);



