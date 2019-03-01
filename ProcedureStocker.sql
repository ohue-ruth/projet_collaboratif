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
    (1,'Toto', 'Idrisse', 'Elysee', '75000', 'Paris', '0600000001', 'Idrisse01', 'Idrisse@yahoo.fr', 1, 1);
    (2,'rir', 'Lokk', 'Paris', '75015', 'Paris', '0600000001', 'sse01', 'Idris@yahoo.fr', 2, 2);
    (3,'rowrow', 'Like', 'Amiens', '80000', 'Amiens', '0600000001', 'Idrisse', 'Idris@yahoo.fr', 3, 3);
    (4,'Mounir', 'Idrisse', 'Lille', '59000', 'Lille', '0600000001', 'Irisse01', 'sse@yahoo.fr', 4, 4);
    (5,'Ridi', 'Idrisse', 'Valenciennes', '59300', 'Valenciennes', '0600000001', 'Idisse01', 'risse@yahoo.fr', 5, 5);

    INSERT INTO promotion (id_promotion, nom, date_debut, date_fin)
    VALUES   (1,'CDI8', '2019/02/01', '2019/03/01');
             (2,'CDIfort', '2017/02/01', '2018/05/01');
             (3,'CDICostaud', '2016/02/01', '2019/09/01');
             (4,'CDA', '2014/02/01', '2014/01/01');
             (5,'BIBI', '2012/02/01', '2013/03/01');
    

    insert into membre_promotion (id_personne, id_promotion)
    values (1,1); (2,2); (3,3); (4,4); (5,5);

    insert into projet (id_projet, id_formateur, id_promotion, titre, date_creation, date_fin)
        values (1, 1, 1, 'Projet_A', '2019/03/01',  '2019/03/12');
        values (2, 2, 2, 'Projet_B', '2018/04/01',  '2019/08/01');
        values (3, 3, 3, 'Projet_C', '2012/03/01',  '2019/08/03');
        values (4, 4, 4, 'Projet_D', '2011/02/01',  '2019/06/28');
        values (5, 5, 5, 'Projet_E', '2010/09/01',  '2019/05/28');


    insert into equipe (id_equipe, id_createur, libelle, date_creation, commentaire)
        values (1, 1, 'equipeCDI', '2019/03/01','Bienvenue');
        values (2, 2, 'EquipeRoto', '2018/09/01','Hello');
        values (3, 3, 'equipeDADA', '2017/03/01','Mes salutations');
        values (4, 4, 'equipeTOTO', '2016/02/01','Coucou');
        values (5, 5, 'equipeCDI8', '2014/05/01','Bonjour');

    insert into membre_equipe (id_projet, id_equipe, id_personne)
        values  (1, 1, 1);
                (2, 2, 2);
                (3, 3, 3);
                (4, 4, 4);
                (5, 5, 5);


	 					
END$$

CALL insererDansPersonne()$$

