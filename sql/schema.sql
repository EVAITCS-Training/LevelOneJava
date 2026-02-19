-- What is SQL --
-- Stucture Query Language --
-- MySQL, MariaDB, PostgreSQL, OracleDB, IBM DB/2, MSSQLServer, SQLite and H2
-- Each one has it's own tradeoff, so you can't just go I only use MySQL DB
-- SQl is used for Persitiant Storage
-- SQL gives a bunch of tools and commands to help process and organize
-- our data into quick retrival
-- it also allows us to give structure to our data
-- A Database is broken into a couple components
-- You have the Database Engine (MySQL)
-- You have a singluar Database
-- You have Database Tables
-- To Create the Database you need to use the Command CREATE DATABASE [database_name];
CREATE DATABASE car_show;
create database car_show;

-- Couple Ways of Creating a table
-- You create it outside of the database

CREATE TABLE car_show.cars(
    -- inside the here, we are going to setup a schema
    -- Another Name for identefier is Primary Key
    -- In the SQL the Primary Key is a Unique Field that is Indexed
    car_id BIGINT PRIMARY KEY      -- BIGINT == Long, INT == Integer, TINYINT == Short/Byte
)