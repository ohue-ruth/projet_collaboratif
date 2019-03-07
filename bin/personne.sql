DELIMITER $$
DROP PROCEDURE IF EXISTS reset_procollab$$
CREATE PROCEDURE reset_procollab() 
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
    
	INSERT INTO personne (nom, prenom, adresse, code_postal, ville, tel, mot_passe, email, est_formateur, est_gestionnaire)
	VALUES
    ('Abdoulhoussen', 'Idrisse', 'Elysee', '75000', 'Paris', '0600000001', 'Idrisse01', 'Idrisse@yahoo.fr', 1, 1);
	 					
END$$

CALL reset_procollab()$$

