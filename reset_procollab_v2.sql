DELIMITER $$
DROP PROCEDURE IF EXISTS insererDansPersonne$$
CREATE PROCEDURE insererDansPersonne() 
BEGIN
	-- desactive les contraintes d'integrite
    SET FOREIGN_KEY_CHECKS=0;
    TRUNCATE TABLE equipe;
    TRUNCATE TABLE membre_equipe;
    TRUNCATE TABLE membre_promotion;
    TRUNCATE TABLE personne;
    TRUNCATE TABLE projet;
    TRUNCATE TABLE promotion;
    SET FOREIGN_KEY_CHECKS=1;
    
	INSERT INTO personne (id_personne, nom, prenom, adresse, code_postal, ville, tel, mot_passe, email, est_formateur, est_gestionnaire)
	VALUES
	-- Formateurs : est_formateur = 1
    (1,'Toto', 'Idrisse', 'Elysee', '75000', 'Paris', '0600000001', 'Idrisse01', 'Idrissse@yahoo.fr', 1, 0),
    (2,'rir', 'Lokk', 'Paris', '75015', 'Paris', '0600000001', 'sse01', 'Idris@yahoo.fr', 1, 0),
    (3,'rowrow', 'Like', 'Amiens', '80000', 'Amiens', '0600000001', 'Idrisse', 'Iiidris@yahoo.fr', 1, 1),
	-- Etudiants : est_formateur = 0 
    (4,'Mounir', 'Idrisse', 'Lille', '59000', 'Lille', '0600000001', 'Irisse01', 'sse@yahoo.fr', 0, 0),
    (5,'Ridi', 'Idrisse', 'Valenciennes', '59300', 'Valenciennes', '0600000001', 'Idisoose01', 'risse@yahoo.fr', 0, 0),
	(6,'Ohue', 'Ruth', '2 rue de Paris', '750016', 'Paris', '0600000001', 'ROhue01', 'rohue@yahoo.fr', 0, 0),
    (7,'Titi', 'Hugo', '5 rue du Gal de Leclerc', '44058', 'Tours', '0600000001', 'HTiti', 'htiti@yahoo.fr', 0, 0),
	(8,'Etudiant8', 'Hugo', '5 rue du Gal de Leclerc', '44058', 'Tours', '0600000001', 'HTiti', 'etudiant8@yahoo.fr', 0, 0),
	(9,'Etudiant9', 'Hugo', '5 rue du Gal de Leclerc', '44058', 'Tours', '0600000001', 'HTiti', 'etudiant9@yahoo.fr', 0, 0),
	(10,'Etudiant10', 'Hugo', '5 rue du Gal de Leclerc', '44058', 'Tours', '0600000001', 'HTiti', 'etudiant10@yahoo.fr', 0, 0),
	(11,'Etudiant11', 'Hugo', '5 rue du Gal de Leclerc', '44058', 'Tours', '0600000001', 'HTiti', 'etudiant11@yahoo.fr', 0, 0);
	-- Etudiant sans projet
	-- (12,'Etudiant12', 'Hugo', '5 rue du Gal de Leclerc', '44058', 'Tours', '0600000001', 'HTiti', 'etudiant12@yahoo.fr', 0, 0);

	-- 2 Session en Cours + 1 Session terminée
    INSERT INTO promotion (id_promotion, nom, date_debut, date_fin)
    VALUES   (1,'CDI8', '2019/02/01', '2019/08/01'),
             (2,'CDICostaud', '2016/02/01', '2019/09/01'),
			 (3,'CDIfort', '2017/02/01', '2018/05/01');
    

    insert into membre_promotion (id_personne, id_promotion)
    values (4,1), 
			(5,1), 
			(6,1), 
			(6,2), 
			(7,2),
			(8,1),
			(9,1),
			(10,1);

    insert into projet (id_projet, id_formateur, id_promotion, titre, date_creation, date_fin)
        values   (1, 1, 1, 'Projet_A', '2019/02/05',  '2019/06/12'),
       			 (2, 1, 1, 'Projet_B', '2019/02/05',  '2019/04/15'),
       			 (3, 1, 1, 'Projet_C', '2019/02/05',  '2019/02/15'),
       			 (4, 2, 1, 'Projet_D', '2019/02/05',  '2019/06/28');


    insert into equipe (id_equipe, id_createur, libelle, date_creation, commentaire)
        values   (1, 1, 'equipeCDI', '2019/03/01','Bienvenue'),
      		     (2, 2, 'EquipeRoto', '2018/09/01','Hello'),
				 (3, 3, 'equipeDADA', '2017/03/01','Mes salutations');

    insert into membre_equipe (id_projet, id_equipe, id_personne)
        values  (1, 1, 4),
                (1, 1, 5),
                (1, 1, 6),
                (1, 2, 7),
                (1, 2, 8),
				(1, 2, 9),
				(1, 3, 10),
				(1, 3, 11),
				(2, 1, 4),
				(2, 1, 5),
				(2, 1, 6),
				(2, 2, 7);


	 					
END$$

CALL insererDansPersonne()$$

