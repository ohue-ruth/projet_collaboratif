-- MySQL Script generated by MySQL Workbench
-- Thu Feb 28 13:32:28 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema procollab
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema procollab
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `procollab` DEFAULT CHARACTER SET utf8 ;
USE `procollab` ;

-- -----------------------------------------------------
-- Table `procollab`.`personne`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procollab`.`personne` (
  `id_personne` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NOT NULL,
  `prenom` VARCHAR(45) NOT NULL,
  `adresse` VARCHAR(45) NULL,
  `code_postal` VARCHAR(45) NULL,
  `ville` VARCHAR(45) NULL,
  `tel` VARCHAR(45) NULL,
  `mot_passe` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `est_formateur` TINYINT NOT NULL DEFAULT 0,
  `est_gestionnaire` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_personne`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `procollab`.`promotion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procollab`.`promotion` (
  `id_promotion` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NOT NULL,
  `date_debut` DATE NOT NULL,
  `date_fin` DATE NOT NULL,
  PRIMARY KEY (`id_promotion`),
  UNIQUE INDEX `nom` (`nom` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `procollab`.`projet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procollab`.`projet` (
  `id_projet` INT NOT NULL,
  `id_formateur` INT NOT NULL,
  `id_promotion` INT NOT NULL,
  `titre` VARCHAR(45) NOT NULL,
  `date_creation` DATETIME NULL,
  `date_fin` DATETIME NULL,
  `sujet` TEXT NULL,
  PRIMARY KEY (`id_projet`),
  INDEX `fk_projet_personne1_idx` (`id_formateur` ASC),
  INDEX `fk_projet_promotion1_idx` (`id_promotion` ASC),
  CONSTRAINT `fk_projet_personne`
    FOREIGN KEY (`id_formateur`)
    REFERENCES `procollab`.`personne` (`id_personne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_projet_promotion1`
    FOREIGN KEY (`id_promotion`)
    REFERENCES `procollab`.`promotion` (`id_promotion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `procollab`.`equipe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procollab`.`equipe` (
  `id_equipe` INT NOT NULL,
  `id_createur` INT NOT NULL,
  `libelle` VARCHAR(45) NOT NULL,
  `date_creation` DATETIME NOT NULL,
  `commentaire` VARCHAR(45) NULL,
  PRIMARY KEY (`id_equipe`),
  INDEX `fk_equipe_personne1_idx` (`id_createur` ASC),
  CONSTRAINT `fk_equipe_personne1`
    FOREIGN KEY (`id_createur`)
    REFERENCES `procollab`.`personne` (`id_personne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `procollab`.`membre_promotion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procollab`.`membre_promotion` (
  `id_personne` INT NOT NULL,
  `id_promotion` INT NOT NULL,
  PRIMARY KEY (`id_personne`, `id_promotion`),
  INDEX `fk_personne_promotion_promotion1_idx` (`id_promotion` ASC),
  INDEX `fk_personne_promotion_personne_idx` (`id_personne` ASC),
  CONSTRAINT `fk_personne_promotion_personne`
    FOREIGN KEY (`id_personne`)
    REFERENCES `procollab`.`personne` (`id_personne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_personne_promotion_promotion1`
    FOREIGN KEY (`id_promotion`)
    REFERENCES `procollab`.`promotion` (`id_promotion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `procollab`.`membre_equipe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `procollab`.`membre_equipe` (
  `id_projet` INT NOT NULL,
  `id_equipe` INT NOT NULL,
  `id_personne` INT NOT NULL,
  PRIMARY KEY (`id_projet`, `id_equipe`, `id_personne`),
  INDEX `fk_projet_equipe_equipe1_idx` (`id_equipe` ASC),
  INDEX `fk_projet_equipe_projet1_idx` (`id_projet` ASC),
  INDEX `fk_projet_equipe_personne1_idx` (`id_personne` ASC),
  UNIQUE INDEX `unique_projet_personne` (`id_projet` ASC, `id_personne` ASC),
  CONSTRAINT `fk_projet_equipe_projet1`
    FOREIGN KEY (`id_projet`)
    REFERENCES `procollab`.`projet` (`id_projet`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_projet_equipe_equipe1`
    FOREIGN KEY (`id_equipe`)
    REFERENCES `procollab`.`equipe` (`id_equipe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_projet_equipe_personne1`
    FOREIGN KEY (`id_personne`)
    REFERENCES `procollab`.`personne` (`id_personne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE USER 'procollab_user'@'localhost' IDENTIFIED BY 'procollab_pwd';

GRANT ALL ON `procollab`.* TO 'procollab_user'@'localhost';
GRANT EXECUTE ON mysql.* TO 'procollab_user'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
