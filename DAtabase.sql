-- Création de la table Materiel
CREATE TABLE Materiel (
    ID_Materiel SERIAL PRIMARY KEY,
    Type VARCHAR(50)
);

-- Création de la table Personnel
CREATE TABLE Personnel (
    ID_Personnel SERIAL PRIMARY KEY,
    Nom VARCHAR(50),
    Prenom VARCHAR(50),
    Fonction VARCHAR(50),
    ID_Materiel_Utilise INT UNIQUE REFERENCES Materiel(ID_Materiel)
);

-- Création de la table Panne
CREATE TABLE etat (
    ID_Panne SERIAL PRIMARY KEY,
    Description TEXT,
    type_etat varchar(120),    
    ID_Materiel_Panne INT REFERENCES Materiel(ID_Materiel),
    ID_Personnel_Assigne INT REFERENCES Personnel(ID_Personnel)
);


CREATE TABLE utilisation(
    id_utilisation SERIAL PRIMARY KEY,
    date_début TIMESTAMP NOT NULL,
    date_fin TIMESTAMP NOT NULL, 
    ID_Personnel_Assigne INT REFERENCES Personnel(ID_Personnel),
     ID_Materiel_utilisé INT REFERENCES Materiel(ID_Materiel)
    
)