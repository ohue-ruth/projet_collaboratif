DELIMITER | -- Facultatif si votre délimiteur est toujours |
CREATE PROCEDURE insererDansPersonne () 
    -- Définition du paramètre p_espece_id
BEGIN
    INSERT INTO personne (nom, prenom, adresse, code_postal, ville, tel, mot_passe, email, est_formateur, est_gestionnaire)
 	VALUES
 						('Abdoulhoussen', 'Idrisse', 'Elysee', '75000', 'Paris', '0600000001', 'Idrisse01', 'Idrisse@yahoo.fr', 1, 1),
	 					
END|
DELIMITER ;  -- On remet le délimiteur par défaut