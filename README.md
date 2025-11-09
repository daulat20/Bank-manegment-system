****Bank Management System****

A simple Java Swing desktop application that simulates basic ATM / bank operations — deposit, withdrawal, balance enquiry, transaction history — built as a learning / demo project.

Repository: daulat20 / Bank-manegment-system. 

**About**

This project is a small bank/ATM management system implemented with Java Swing for UI and a simple JDBC-based database connection (local RDBMS such as MySQL). It stores transactions in a bank table and computes account balance by summing deposits and subtracting withdrawals.

**Features**

Login / PIN-based flow (via Main_Class in the project)

Deposit (records a Deposite transaction)

Withdraw (records a Withdraw transaction and checks balance)

Balance Enquiry (calculates balance from transaction history)

Transaction history (stored in bank table)

Simple GUI using Java Swing and background ATM image

Java (JDK 8+ recommended)

Java Swing (UI)

JDBC for database connectivity

MySQL / MariaDB (or any relational DB) for storing transactions

#Note: class names in your code include Withdrawl and BaleneceEnquery — be consistent with spellings across UI/DB strings to avoid logic bugs.

**Common issues & fixes**
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
