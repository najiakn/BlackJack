create table main(id_main int primary key ,
				 valeurTotalMain int ,
				 nbCartesMain int );
				 
CREATE TABLE joueur (
    id_joueur SERIAL PRIMARY KEY,
    soldJoueur INT,
    idMain INT REFERENCES main(id_main)
); 

create table carte(id_carte int primary key ,couleurCarte varchar(20),valeurCarte int);


				 

