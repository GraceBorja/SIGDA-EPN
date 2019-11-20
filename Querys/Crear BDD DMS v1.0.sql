-- MySQL Script generated by MySQL Workbench
-- Wed Nov 20 14:03:49 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema dms_bdd
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `dms_bdd` ;

-- -----------------------------------------------------
-- Schema dms_bdd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dms_bdd` DEFAULT CHARACTER SET utf8 ;
USE `dms_bdd` ;

-- -----------------------------------------------------
-- Table `dms_bdd`.`Area`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`Area` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`Area` (
  `idArea` INT NOT NULL AUTO_INCREMENT,
  `nombreArea` VARCHAR(100) NOT NULL,
  `siglaArea` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`idArea`),
  UNIQUE INDEX `Sigla_UNIQUE` (`siglaArea` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`SubArea`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`SubArea` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`SubArea` (
  `idSubArea` INT NOT NULL AUTO_INCREMENT,
  `nombreSubArea` VARCHAR(100) NOT NULL,
  `siglaSubArea` VARCHAR(25) NULL,
  `Area_idArea` INT NOT NULL,
  PRIMARY KEY (`idSubArea`, `Area_idArea`),
  INDEX `fk_SubArea_Area1_idx` (`Area_idArea` ASC),
  CONSTRAINT `fk_SubArea_Area1`
    FOREIGN KEY (`Area_idArea`)
    REFERENCES `dms_bdd`.`Area` (`idArea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`Usuario` (
  `numeroCedula` VARCHAR(10) NOT NULL,
  `nombres` VARCHAR(100) NOT NULL,
  `apellidos` VARCHAR(100) NOT NULL,
  `correo` VARCHAR(100) NOT NULL,
  `numeroTelefonoCelular` VARCHAR(10) NOT NULL,
  `tipoUsuario` VARCHAR(5) NOT NULL,
  `estadoUsuario` VARCHAR(10) NOT NULL,
  `SubArea_idSubArea` INT NOT NULL,
  `SubArea_Area_idArea` INT NOT NULL,
  PRIMARY KEY (`numeroCedula`, `SubArea_idSubArea`, `SubArea_Area_idArea`),
  INDEX `fk_Usuario_SubArea1_idx` (`SubArea_idSubArea` ASC, `SubArea_Area_idArea` ASC),
  CONSTRAINT `fk_Usuario_SubArea1`
    FOREIGN KEY (`SubArea_idSubArea` , `SubArea_Area_idArea`)
    REFERENCES `dms_bdd`.`SubArea` (`idSubArea` , `Area_idArea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`Login`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`Login` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`Login` (
  `idLogin` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `Usuario_numeroCedula` VARCHAR(10) NOT NULL,
  `Usuario_SubArea_idSubArea` INT NOT NULL,
  `Usuario_SubArea_Area_idArea` INT NOT NULL,
  PRIMARY KEY (`idLogin`, `Usuario_numeroCedula`, `Usuario_SubArea_idSubArea`, `Usuario_SubArea_Area_idArea`),
  INDEX `fk_Login_Usuario1_idx` (`Usuario_numeroCedula` ASC, `Usuario_SubArea_idSubArea` ASC, `Usuario_SubArea_Area_idArea` ASC),
  CONSTRAINT `fk_Login_Usuario1`
    FOREIGN KEY (`Usuario_numeroCedula` , `Usuario_SubArea_idSubArea` , `Usuario_SubArea_Area_idArea`)
    REFERENCES `dms_bdd`.`Usuario` (`numeroCedula` , `SubArea_idSubArea` , `SubArea_Area_idArea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`TipoExpediente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`TipoExpediente` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`TipoExpediente` (
  `idTipoExpediente` INT NOT NULL AUTO_INCREMENT,
  `nombreTipoExpediente` VARCHAR(50) NOT NULL,
  `tiempoVigenciaAnios` INT NOT NULL,
  `tiempoMaximo` INT NOT NULL,
  PRIMARY KEY (`idTipoExpediente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`Expediente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`Expediente` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`Expediente` (
  `idExpediente` VARCHAR(25) NOT NULL,
  `numeroCaja` VARCHAR(10) NULL,
  `serie` VARCHAR(200) NOT NULL,
  `subSerie` VARCHAR(200) NULL,
  `asunto` VARCHAR(500) NOT NULL,
  `fechaDesde` DATE NOT NULL,
  `fechaHasta` DATE NOT NULL,
  `medioAlmacenamiento` VARCHAR(45) NOT NULL,
  `medioAlmacenamientoOtro` VARCHAR(45) NULL,
  `numeroFolios` INT NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `observacion` VARCHAR(300) NULL,
  `urlDigital` VARCHAR(200) NULL,
  `SubArea_idSubArea` INT NOT NULL,
  `SubArea_Area_idArea` INT NOT NULL,
  `TipoExpediente_idTipoExpediente` INT NOT NULL,
  PRIMARY KEY (`idExpediente`, `SubArea_idSubArea`, `SubArea_Area_idArea`, `TipoExpediente_idTipoExpediente`),
  UNIQUE INDEX `idExpediente_UNIQUE` (`idExpediente` ASC),
  INDEX `fk_Expediente_SubArea1_idx` (`SubArea_idSubArea` ASC, `SubArea_Area_idArea` ASC),
  INDEX `fk_Expediente_TipoExpediente1_idx` (`TipoExpediente_idTipoExpediente` ASC),
  CONSTRAINT `fk_Expediente_SubArea1`
    FOREIGN KEY (`SubArea_idSubArea` , `SubArea_Area_idArea`)
    REFERENCES `dms_bdd`.`SubArea` (`idSubArea` , `Area_idArea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Expediente_TipoExpediente1`
    FOREIGN KEY (`TipoExpediente_idTipoExpediente`)
    REFERENCES `dms_bdd`.`TipoExpediente` (`idTipoExpediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`EliminadoArea`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`EliminadoArea` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`EliminadoArea` (
  `idEliminadoArea` INT NOT NULL AUTO_INCREMENT,
  `fechaEliminacion` DATE NOT NULL,
  `actaArea` VARCHAR(15) NOT NULL,
  `Expediente_idExpediente` VARCHAR(25) NOT NULL,
  `Expediente_SubArea_idSubArea` INT NOT NULL,
  `Expediente_SubArea_Area_idArea` INT NOT NULL,
  `Expediente_TipoExpediente_idTipoExpediente` INT NOT NULL,
  PRIMARY KEY (`idEliminadoArea`, `Expediente_idExpediente`, `Expediente_SubArea_idSubArea`, `Expediente_SubArea_Area_idArea`, `Expediente_TipoExpediente_idTipoExpediente`),
  INDEX `fk_EliminadoArea_Expediente1_idx` (`Expediente_idExpediente` ASC, `Expediente_SubArea_idSubArea` ASC, `Expediente_SubArea_Area_idArea` ASC, `Expediente_TipoExpediente_idTipoExpediente` ASC),
  CONSTRAINT `fk_EliminadoArea_Expediente1`
    FOREIGN KEY (`Expediente_idExpediente` , `Expediente_SubArea_idSubArea` , `Expediente_SubArea_Area_idArea` , `Expediente_TipoExpediente_idTipoExpediente`)
    REFERENCES `dms_bdd`.`Expediente` (`idExpediente` , `SubArea_idSubArea` , `SubArea_Area_idArea` , `TipoExpediente_idTipoExpediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`Transferencia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`Transferencia` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`Transferencia` (
  `idTransferencia` VARCHAR(25) NOT NULL,
  `fechaTransferencia` DATE NOT NULL,
  `fechaConservacion` DATE NULL,
  `valoracion` VARCHAR(10) NOT NULL,
  `Expediente_idExpediente` VARCHAR(25) NOT NULL,
  `Expediente_SubArea_idSubArea` INT NOT NULL,
  `Expediente_SubArea_Area_idArea` INT NOT NULL,
  `Expediente_TipoExpediente_idTipoExpediente` INT NOT NULL,
  PRIMARY KEY (`idTransferencia`, `Expediente_idExpediente`, `Expediente_SubArea_idSubArea`, `Expediente_SubArea_Area_idArea`, `Expediente_TipoExpediente_idTipoExpediente`),
  INDEX `fk_Transferencia_Expediente1_idx` (`Expediente_idExpediente` ASC, `Expediente_SubArea_idSubArea` ASC, `Expediente_SubArea_Area_idArea` ASC, `Expediente_TipoExpediente_idTipoExpediente` ASC),
  CONSTRAINT `fk_Transferencia_Expediente1`
    FOREIGN KEY (`Expediente_idExpediente` , `Expediente_SubArea_idSubArea` , `Expediente_SubArea_Area_idArea` , `Expediente_TipoExpediente_idTipoExpediente`)
    REFERENCES `dms_bdd`.`Expediente` (`idExpediente` , `SubArea_idSubArea` , `SubArea_Area_idArea` , `TipoExpediente_idTipoExpediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`ExpedienteGeneral`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`ExpedienteGeneral` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`ExpedienteGeneral` (
  `idExpedienteGeneral` VARCHAR(25) NOT NULL,
  `codigoUbicacionFisica` VARCHAR(25) NOT NULL,
  `digital` TINYINT NOT NULL,
  `observacion` VARCHAR(300) NULL,
  `Transferencia_idTransferencia` VARCHAR(25) NOT NULL,
  `Transferencia_Expediente_idExpediente` VARCHAR(25) NOT NULL,
  `Transferencia_Expediente_SubArea_idSubArea` INT NOT NULL,
  `Transferencia_Expediente_SubArea_Area_idArea` INT NOT NULL,
  `Transferencia_Expediente_TipoExpediente_idTipoExpediente` INT NOT NULL,
  PRIMARY KEY (`idExpedienteGeneral`, `Transferencia_idTransferencia`, `Transferencia_Expediente_idExpediente`, `Transferencia_Expediente_SubArea_idSubArea`, `Transferencia_Expediente_SubArea_Area_idArea`, `Transferencia_Expediente_TipoExpediente_idTipoExpediente`),
  INDEX `fk_ExpedienteGeneral_Transferencia1_idx` (`Transferencia_idTransferencia` ASC, `Transferencia_Expediente_idExpediente` ASC, `Transferencia_Expediente_SubArea_idSubArea` ASC, `Transferencia_Expediente_SubArea_Area_idArea` ASC, `Transferencia_Expediente_TipoExpediente_idTipoExpediente` ASC),
  CONSTRAINT `fk_ExpedienteGeneral_Transferencia1`
    FOREIGN KEY (`Transferencia_idTransferencia` , `Transferencia_Expediente_idExpediente` , `Transferencia_Expediente_SubArea_idSubArea` , `Transferencia_Expediente_SubArea_Area_idArea` , `Transferencia_Expediente_TipoExpediente_idTipoExpediente`)
    REFERENCES `dms_bdd`.`Transferencia` (`idTransferencia` , `Expediente_idExpediente` , `Expediente_SubArea_idSubArea` , `Expediente_SubArea_Area_idArea` , `Expediente_TipoExpediente_idTipoExpediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `dms_bdd`.`eliminadoGeneral`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dms_bdd`.`eliminadoGeneral` ;

CREATE TABLE IF NOT EXISTS `dms_bdd`.`eliminadoGeneral` (
  `ideliminadoGeneral` INT NOT NULL AUTO_INCREMENT,
  `fechaEliminadoGeneral` DATE NOT NULL,
  `numeroActaGeneral` VARCHAR(15) NOT NULL,
  `ExpedienteGeneral_idExpedienteGeneral` VARCHAR(25) NOT NULL,
  `EG_T_idTransferencia` VARCHAR(25) NOT NULL,
  `EG_T_E_idExpediente` VARCHAR(25) NOT NULL,
  `EG_T_E_SA_idSubArea` INT NOT NULL,
  `EG_T_E_SA_A_idArea` INT NOT NULL,
  `EG_T_E_TE_idTipoExpediente` INT NOT NULL,
  PRIMARY KEY (`ideliminadoGeneral`, `ExpedienteGeneral_idExpedienteGeneral`, `EG_T_idTransferencia`, `EG_T_E_idExpediente`, `EG_T_E_SA_idSubArea`, `EG_T_E_SA_A_idArea`, `EG_T_E_TE_idTipoExpediente`),
  INDEX `fk_eliminadoGeneral_ExpedienteGeneral1_idx` (`ExpedienteGeneral_idExpedienteGeneral` ASC, `EG_T_idTransferencia` ASC, `EG_T_E_idExpediente` ASC, `EG_T_E_SA_idSubArea` ASC, `EG_T_E_SA_A_idArea` ASC, `EG_T_E_TE_idTipoExpediente` ASC),
  CONSTRAINT `fk_eliminadoGeneral_ExpedienteGeneral1`
    FOREIGN KEY (`ExpedienteGeneral_idExpedienteGeneral` , `EG_T_idTransferencia` , `EG_T_E_idExpediente` , `EG_T_E_SA_idSubArea` , `EG_T_E_SA_A_idArea` , `EG_T_E_TE_idTipoExpediente`)
    REFERENCES `dms_bdd`.`ExpedienteGeneral` (`idExpedienteGeneral` , `Transferencia_idTransferencia` , `Transferencia_Expediente_idExpediente` , `Transferencia_Expediente_SubArea_idSubArea` , `Transferencia_Expediente_SubArea_Area_idArea` , `Transferencia_Expediente_TipoExpediente_idTipoExpediente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;