Bank Management System

A simple Java Swing desktop application that simulates basic ATM / bank operations — deposit, withdrawal, balance enquiry, transaction history — built as a learning / demo project.

Repository: daulat20 / Bank-manegment-system. 


Table of contents

About

Features

Tech stack

Repo structure (typical)

Prerequisites

Database schema & setup

How to run (import & execute)

Usage / Flow

Common issues & fixes

.gitignore suggestion

Contributing

License & Contact

About

This project is a small bank/ATM management system implemented with Java Swing for UI and a simple JDBC-based database connection (local RDBMS such as MySQL). It stores transactions in a bank table and computes account balance by summing deposits and subtracting withdrawals.

Features

Login / PIN-based flow (via Main_Class in the project)

Deposit (records a Deposite transaction)

Withdraw (records a Withdraw transaction and checks balance)

Balance Enquiry (calculates balance from transaction history)

Transaction history (stored in bank table)

Simple GUI using Java Swing and background ATM image

Tech stack

Java (JDK 8+ recommended)

Java Swing (UI)

JDBC for database connectivity

MySQL / MariaDB (or any relational DB) for storing transactions

Repo structure (typical)

(Since GitHub UI may be restricted for me to inspect files, below is a conventional structure based on the classes you shared.)

Bank-manegment-system/
├─ src/
│  └─ Bank/
│     ├─ Main_Class.java
│     ├─ DbConnection.java
│     ├─ Withdrawl.java
│     ├─ BaleneceEnquery.java
│     ├─ Deposit.java
│     └─ ...other GUI classes...
├─ resources/
│  └─ atm2.png
├─ README.md
└─ .gitignore


Note: class names in your code include Withdrawl and BaleneceEnquery — be consistent with spellings across UI/DB strings to avoid logic bugs.

Prerequisites

JDK 8 or higher installed and JAVA_HOME set

An IDE (IntelliJ IDEA / Eclipse / NetBeans) or command-line javac/java

MySQL (or other RDBMS) and a user with privileges to create / insert / select

Database schema & setup
Recommended bank table

This project uses a simple transaction log table named bank. Example schema:

CREATE DATABASE bank_system;
USE bank_system;

CREATE TABLE bank (
  id INT AUTO_INCREMENT PRIMARY KEY,
  pin VARCHAR(20) NOT NULL,
  txn_date VARCHAR(50) NOT NULL,
  type VARCHAR(20) NOT NULL,
  amount INT NOT NULL
);


pin — account identifier used in your app

txn_date — store date/time (your app currently stores new Date().toString() or similar)

type — 'Deposite' or 'Withdraw' (use consistent spelling)

amount — numeric amount (INT)

Important: The application calculates balance at runtime by querying all rows for a PIN and summing deposits / subtracting withdrawals. If you prefer a persistent balance, add an accounts table and update it on each transaction (example below).

Optional accounts table (to store running balance)
CREATE TABLE accounts (
  pin VARCHAR(20) PRIMARY KEY,
  balance INT DEFAULT 0
);

-- On deposit:
UPDATE accounts SET balance = balance + {amount} WHERE pin = '{pin}';
-- On withdraw:
UPDATE accounts SET balance = balance - {amount} WHERE pin = '{pin}';

How to run (import & execute)
1. Clone the repo
git clone https://github.com/daulat20/Bank-manegment-system.git
cd Bank-manegment-system

2. Import into IDE

Open your IDE and import the project as a Java project (if using Maven/Gradle, import that way — if not, add src to classpath).

Make sure resources/atm2.png or equivalent image is on the classpath or reachable via getResource("/Bank/atm2.png").

3. Configure DB connection

Open DbConnection.java (or whatever class manages JDBC).

Ensure url, username, password, and JDBC driver are correct (e.g., com.mysql.cj.jdbc.Driver).

Create the bank database and table in your MySQL instance (see schema above).

4. Run the app

Run Main_Class (or whichever class is the entry point).

Follow GUI to deposit, withdraw, or view balance.

Usage / Flow

Start app → Main_Class window appears (login / choose operation).

Deposit: record 'Deposite' transaction with amount.

Withdraw: checks balance (sums deposits − withdrawals). If enough, inserts 'Withdraw' record.

Balance Enquiry: sums transactions to show current balance.

Common issues & fixes
1. Balance displays incorrect values

Cause: inconsistent spelling of type column values (e.g., Withdrawl vs Withdraw vs withdraw).

Fix: Standardize to one value ("Deposite" and "Withdraw") and use equalsIgnoreCase() when comparing.

2. Withdrawal not deducted

Cause: Inserted transaction type mismatches logic; or balance logic reversed in one class.

Fix: Ensure all classes use the same add/subtract logic:

if (type.equalsIgnoreCase("Deposite")) balance += amt;
else if (type.equalsIgnoreCase("Withdraw")) balance -= amt;

3. Non-numeric input crashes UI

Fix: Catch NumberFormatException and show a friendly JOptionPane error.

4. Date stored in odd format

Fix: Consider storing txn_date as DATETIME and pass java.sql.Timestamp from Java.

.gitignore suggestion

Add a .gitignore to keep build files, IDE settings, and secrets out of the repo:

# Compiled classes
*.class
# Build directories
/bin/
/build/
/out/

# IDE settings
/.idea/
*.iml
/.vscode/

# OS files
.DS_Store
Thumbs.db

# Database or local secret files
*.sql
*.db

Contribution

Fix typos and standardize naming (Withdrawl → Withdraw, BaleneceEnquery → BalanceEnquiry) for readability.

Add unit tests or simple integration tests (if you refactor to separate logic from UI).

Consider adding an accounts table for faster balance lookup and transaction atomicity.

If you want, I can:

create a polished README.md file and provide the content ready to paste, or

open a PR with consistent renames and improved validation (if you give me permission / access).
