# 🏦 Bank Management System (Java Swing + MySQL)

A desktop-based **Bank Management System** built using **Java Swing** and **MySQL**.
This project simulates basic ATM functionalities like account creation, login, deposit, withdrawal, and transaction handling.

---

## 🚀 Features

* 🔐 User Authentication (Card Number + PIN)
* 📝 Multi-step Account Registration
* 💰 Deposit Money
* 💸 Withdraw Money
* ⚡ Fast Cash
* 📊 Balance Enquiry
* 🧾 Mini Statement
* 🔄 PIN Change

---

## 🛠️ Tech Stack

* **Frontend:** Java Swing (GUI)
* **Backend:** Java (Core + JDBC)
* **Database:** MySQL
* **IDE:** IntelliJ / Eclipse / NetBeans

---

## 🗂️ Project Structure

```
bank.management.system/
│
├── Login.java
├── Signup.java
├── Signup2.java
├── Signup3.java
├── Deposit.java
├── Withdrawl.java
├── BalanceEnquiry.java
├── FastCash.java
├── Pin.java
├── mini.java
├── Connn.java
├── main_Class.java
│
└── icon/ (images)
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/bank-management-system.git
cd bank-management-system
```

---

### 2️⃣ Setup MySQL Database

Open MySQL and run:

```sql
CREATE DATABASE bankSystem;
USE bankSystem;

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

CREATE TABLE signuptwo (
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
```

---

### 3️⃣ Configure Database Connection

Update `Connn.java`:

```java
connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/bankSystem",
    "root",
    "your_password"
);
```

---

### 4️⃣ Add Required Libraries

* MySQL Connector (JDBC)
* JCalendar (for date picker)

---

### 5️⃣ Run the Project

Run:

```
Login.java
```

---

## 📸 Screens (Optional)

* Login Screen
* Signup Forms
* ATM Dashboard

(Add screenshots here if uploading to GitHub)

---

## ⚠️ Known Issues

* Uses basic Swing UI (not responsive)
* SQL queries are not secured (no PreparedStatement)
* No password encryption

---

## 🚀 Future Improvements

* Use PreparedStatement (prevent SQL Injection)
* Improve UI (modern design)
* Add transaction history screen
* Convert to web app (React + Node.js)

---

## 👨‍💻 Author

**Adii**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and feel free to contribute!
