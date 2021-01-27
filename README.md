# Formation CDA à l'AFPA
[![N|Solid](https://www.afpa.fr/image/layout_set_logo?img_id=34521924&t=1611326573313)](https://sites.google.com/view/promotionfeynman)

Le numérique, c'est l'avenir !

Nous avons tous déjà entendu cette phrase, mais qui a vraiment sauté le pas ?

La formation CDA a pour objectif de former  des stagiaires  aux bases de la conception et developpement d'applications. 
Il s'agit d'acquérir des bases techniques mais également d'apprendre un savoir-être indispensable : 
travailler en groupe au sein d'une entreprise.
 Pour en savoir plus sur notre équipe et notre formation n'hesitez pas à consulter la page de la meilleur formation CDA, c'est à ARRAS avec la promo Feynman :
 
 [![N|Solid](https://www.afpa.fr/image/layout_set_logo?img_id=34521924&t=1611326573313)](https://sites.google.com/view/promotionfeynman)

 
# JavaJdbcTutorial

Java Database Connectivity ( JDBC) est un Java API standard utilisé pour interagir avec toutes les formes de bases données relationnelles. 
JDBC dispose d'un ensemble de classes et d'interfaces qui peuvent utiliser dans des applications Java pour communiquer avec la base des données.

 
## Objectif de ce Tutoriale

Ce tutoriale montre comment on se connecte gràce à l'API JDBC, à une base de donnée Oracle ou  Mysql.

## Tester ce Tutoriale sur MySQL
Pour tester mysql 

Lancer le script simplehr-mysql.sql qui est dans ressources/sql

ce script :

	- crée la base simplehr
	- sélectionne cette base 
	- crée les tables 
	- insère les données
	- crée la procédure stocké

dans ConnectionUtils :

    return MySQLConnUtils.getMySQLConnection();
    //	return OracleConnUtils.getOracleConnection();

## Tester ce Tutoriale sur Oracle

 Sur windows powershell :
 
	sqlplus
	user/password
	alter session set "_ORACLE_SCRIPT"=true;
	create user simplerh identified by root;
	grant dba to simplerh ;

se connecter qur sql developper ou plsql developper avec simplerh/root;

Lancez le script simplehr-oracle.sql qui est dans ressources/sql 

ce script :

	- crée les tables 
	- insère les données
	- crée la procédure stocké : OL/SQL

dans ConnectionUtils commanter la ligne mysql et décommanter la ligne oracle:

     // return MySQLConnUtils.getMySQLConnection();
   	return OracleConnUtils.getOracleConnection();

## Votre avis nous intéresse:

Merci d'avoir testé notre tutoriale , n'hesiter pas à vous mettre en contact avec notre équipe !

 [![N|Solid](https://www.afpa.fr/image/layout_set_logo?img_id=34521924&t=1611326573313)](https://sites.google.com/view/promotionfeynman)
