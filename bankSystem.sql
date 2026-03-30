create database bankSystem;
use bankSystem;

CREATE TABLE signup (
    formno VARCHAR(20),
    name VARCHAR(50),
    father_name VARCHAR(50),
    dob VARCHAR(20),
    gender VARCHAR(10),
    email VARCHAR(50),
    marital_status VARCHAR(20),
    address VARCHAR(100),
    city VARCHAR(50),
    pincode VARCHAR(20),
    state VARCHAR(50)
);


CREATE TABLE signuptwo(
    formno VARCHAR(20),
    religion VARCHAR(20),
    category VARCHAR(20),
    income VARCHAR(30),
    education VARCHAR(30),
    occupation VARCHAR(30),
    pan VARCHAR(20),
    aadhar VARCHAR(20),
    senior_citizen VARCHAR(10),
    existing_account VARCHAR(10)
);


CREATE TABLE signupthree (
    formno VARCHAR(20),
    account_type VARCHAR(50),
    card_number VARCHAR(25),
    pin VARCHAR(10),
    facility VARCHAR(200)
);



CREATE TABLE login (
    formno VARCHAR(20),
    card_number VARCHAR(25),
    pin VARCHAR(10)
);

CREATE TABLE bank (
    pin VARCHAR(10),
    date VARCHAR(50),
    type VARCHAR(20),
    amount VARCHAR(20)
);

show tables;

