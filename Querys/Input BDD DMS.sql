-- Script insertar datos a las tablas --
use dms_bdd

-- Áreas
insert into area values (0,'FACULTAD DE CIENCIAS','FC');
insert into area values (0,'FACULTAD DE INGENIERÍA DE SISTEMAS','FIS');
insert into area values (0,'BIBLIOTECAS','BG');
insert into area values (0,'DIRECCIÓN DE TALENTO HUMANO','DTH');
insert into area values (0,'INGENIERÍA CIVIL Y AMBIENTAL','FICA');
insert into area values (0,'CEC','CEC');
insert into area values (0,'SECRETARÍA GENERAL','SG');
insert into area values (0,'METALMECÁNICA SAN BARTOLO','MSB');
insert into area values (0,'RECTORADO','R');

select * from area;

-- Login
insert into login values (0,'1728172938','4321','1728172938',2,1);
insert into login values (0,'1728371923','1234','1728371923',11,7);


SELECT *FROM login;

-- Subáreas
insert into subarea values (0,'DECANATO','FCD',1);
insert into subarea values (0,'SUBDECANATO','FCSD',1);
insert into subarea values (0,'DECANATO','FISD',2);
insert into subarea values (0,'SUBDECANATO','FISSD',2);
insert into subarea values (0,'DECANATO','FICAD',5);
insert into subarea values (0,'SUBDECANATO','FICASD',5);
insert into subarea values (0,'ÁREA ADMINISTRATIVA FINANCIERA','CEC-AAF',6);
insert into subarea values (0,'ÁREA DE CALIDAD Y TALENTO HUMANO','CEC-ACTH',6);
insert into subarea values (0,'ÁREA DE LINGÜÍSTICA E INTERCAMBIOS CULTURALES','CEC-ALIC',6);
insert into subarea values (0,'ÁREA DE MARKETING','CEC-AM',6);
insert into subarea values (0,'SECRETARÍA GENERAL','SG',7);

select *from subarea;

-- Tipo de Expediente
insert into tipoexpediente values (0,'Documentos de Simple Administración',5,8);
insert into tipoexpediente values (0,'Documentos Administrativo',7,15);
insert into tipoexpediente values (0,'Documentos Legales',7,15);
insert into tipoexpediente values (0,'Documentos Contables',7,15);
insert into tipoexpediente values (0,'Documentos Técnicos',7,15);
insert into tipoexpediente values (0,'Documentos Académicos',7,100);

select *from tipoexpediente;


-- Expediente
insert into expediente values ('SG-DA-2012-0001',null,'EXPEDIENTES ACADÉMICOS','CIENCIAS ECONÓMICAS Y FINANCIERAS','CASTILLO CASTILLO ROCIO ALEXANDRA, CASTILLO SARANGO DIEGO ALCIVAR, LUGO ALDAS SILVIA EUGENIA, ROSERO RAMOS DIEGO ALEJANDRO, TOAPANTA QUISHPE JOHANNA ELIZABETH','2012-01-01','2012-01-01','LIBRO',null,144,'ARCHIVO HISTÓRICO',null,null,2,1,6);
insert into expediente values ('SG-DA-2012-0002',null,'EXPEDIENTES ACADÉMICOS','CIENCIAS ECONÓMICAS Y FINANCIERAS','OÑA MACIAS ANA LUCIA, REAL ESCOBAR CLAUDIA ROSANA, RIVADENEIRA BRITO BORIS ALEXANDER, SANTILLAN HARO MARIA CAROLINA, TERAN VISCARRA DIEGO ALEXANDER, VACA RAMIREZ FELIPE JAVIER, VILLACIS CONRADO JUAN GABRIEL','2012-01-01','2012-01-01','LIBRO',null,195,'ARCHIVO HISTÓRICO',null,null,2,1,6);
insert into expediente values ('SG-DA-2012-0003',null,'EXPEDIENTES ACADÉMICOS','CIENCIAS ECONÓMICAS Y FINANCIERAS','ALMEIDA BAROJA EDUARDO DAVID, ARBOLEDA MOREANO GABRIELA ELIZA, CABEZAS RUBIO MARIA BELEN, GUEVARA GUEVARA JOHANA JULIETA, NUÑEZ ACOSTA ADRIANA FERNANDA, PASTAZA GUTIERREZ ALEXANDRA ROCIO, SUQUILLO LLUMIQUINGA LILIANA ELIZABETH, VERGARA ORTIZ DANIELA ALEJANDRA, ZAMBRANO RODRIGUEZ DAVID ALFONSO','2012-01-01','2012-01-01','LIBRO',null,243,'ARCHIVO HISTÓRICO',null,null,2,1,6);
insert into expediente values ('SG-DA-2013-0001',null,'EXPEDIENTES ACADÉMICOS','CIENCIAS ECONÓMICAS Y FINANCIERAS','ALMEIDA VELEZ ANDREA ESTEFANIA, ARAUJO MUÑOZ SARA EMILIA, ARIAS ANDRADE SILVANA CAROLINA, ARMAS ROMERO CYNTHIA CAROLINA, ASTUDILLO PINARGOTE DORIS NOREY, BANDERAS BENITEZ VALERIA ELIZABETH, BENALCAZAR DE LA CRUZ CRISTIAN ROBERTO, CHICO TERAN MARIA GABRIELA, CHIRIBOGA HERNANDEZ LOREIMA LOURDES, GUERRERO MENA ERIKA MARIBEL','2013-01-01','2013-01-01','LIBRO',null,264,'ARCHIVO HISTÓRICO',null,null,2,1,6);
insert into expediente values ('SG-DA-2013-0002',null,'EXPEDIENTES ACADÉMICOS','CIENCIAS ECONÓMICAS Y FINANCIERAS','HIDALGO ROMERO PABLO DAVID, HIDALGO RIOS ANDREA GRACIELA, IZQUIERDO CAMPOVERDE MARIANA XIMENA, LIZANO AVILES DAVID RICARDO, NAVARRETE TUPIZA JORGE ESTUARDO, ORTEGA AREVALO CHRISTIAN FERNANDO, PESANTEZ CABRERA TANIA ERIKA, SARANGO SANCHEZ TATIANA ELIZABETH, TORRES CUMBICUS GINA KATHERYNE, VILLACRES RONDAL NESTOR JOSE, ZAMBRANO ORELLANA ROXANA PATRICIA','2013-01-01','2013-01-01','LIBRO',null,295,'ARCHIVO HISTÓRICO',null,null,2,1,6);

select * from expediente;

-- EliminadoArea
 insert into eliminadoarea values (0,'2019-11-14','2018-0100','SG-DA-2012-0003',2,1,6);
 
 
 select *from eliminadoarea;
 
 -- Transferencia
insert into transferencia values('DA-0001','2019-11-15',null,'HISTÓRICO','SG-DA-2012-0003',2,1,6);


 select *from transferencia;
 
 -- Archivo General
/* insert into expedientegeneral values('EPN-SG-DA-0001','S.A-E9-C1-B2',true,null,'DA-0001','SG-DA-2019-0001',3,4,4);
insert into expedientegeneral values('EPN-SG-GIVS-0001','S.A-E9-C1-B1',true,null,'DA-0001','SG-DA-2019-0001',3,4,4);
insert into expedientegeneral values('EPN-SG-DA-0002','S.A-E9-C3-B1',false,null,'DA-0001','SG-DA-2019-0001',3,4,4);
insert into expedientegeneral values('EPN-SG-0002','S.A-E9-C1-B1',false,null,'DA-0004','SG-DA-2019-0001',3,4,4);
insert into expedientegeneral values('EPN-SG-CP-0001','S.A-E9-C1-B2',true,null,'DA-0005','SG-DA-2019-0001',3,4,4);
 */
 select * from expedientegeneral;
 
 -- EliminadoGeneral
 select *from eliminadogeneral;
 
 /*insert into eliminadogeneral values(0, '2019-02-22','2019-0010','EPN-SG-0002','DA-0004','SG-DA-2019-0001',3,4,4);
 insert into eliminadogeneral values(0, '2019-11-21','2019-0020','EPN-SG-CP-0001','DA-0005','SG-DA-2019-0001',3,4,4);
 insert into eliminadogeneral values(0, '2019-10-22','2019-0010','EPN-SG-DA-0001','DA-0001','SG-DA-2019-0001',3,4,4);
 insert into eliminadogeneral values(0, '2019-10-20','2019-0010','EPN-SG-DA-0002','DA-0001','SG-DA-2019-0001',3,4,4);
 insert into eliminadogeneral values(0, '2019-11-21','2019-0020','EPN-SG-GIVS-0001','DA-0001','SG-DA-2019-0001',3,4,4);
 */
 SELECT *FROM eliminadogeneral;
 

 
 
 
 
 
 
 
 