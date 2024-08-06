# PL/SQL Exercises

## Exercise 1: Control Structures

1. **Discount on Loan Interest Rates**
    - Write a PL/SQL block to loop through all customers and apply a 1% discount to the loan interest rates for customers above 60 years old.

2. **Promote Customers to VIP Status**
    - Write a PL/SQL block to iterate through all customers and set the `IsVIP` flag to `TRUE` for those with a balance over $10,000.

3. **Loan Due Reminders**
    - Write a PL/SQL block to fetch all loans due in the next 30 days and print a reminder message for each customer.

## Exercise 2: Error Handling

1. **Safe Fund Transfers**
    - Write a stored procedure `SafeTransferFunds` to transfer funds between accounts. Handle errors such as insufficient funds by logging an error and rolling back the transaction.

2. **Update Employee Salaries**
    - Write a stored procedure `UpdateSalary` to increase the salary of an employee by a given percentage. Handle exceptions for non-existent employee IDs and log an error message.

3. **Add New Customer with Data Integrity**
    - Write a stored procedure `AddNewCustomer` to insert a new customer into the `Customers` table. Handle exceptions for duplicate customer IDs by logging an error and preventing the insertion.

## Exercise 3: Stored Procedures

1. **Process Monthly Interest for Savings Accounts**
    - Write a stored procedure `ProcessMonthlyInterest` to calculate and update the balance of all savings accounts by applying a 1% interest rate.

2. **Employee Bonus Scheme**
    - Write a stored procedure `UpdateEmployeeBonus` to update the salary of employees in a given department by adding a bonus percentage.

3. **Transfer Funds Between Accounts**
    - Write a stored procedure `TransferFunds` to transfer a specified amount from one account to another, ensuring the source account has sufficient balance.

## Exercise 4: Functions

1. **Calculate Customer Age**
    - Write a function `CalculateAge` to take a customer's date of birth as input and return their age in years.

2. **Compute Monthly Loan Installment**
    - Write a function `CalculateMonthlyInstallment` to take the loan amount, interest rate, and loan duration in years as input and return the monthly installment amount.

3. **Check Sufficient Balance**
    - Write a function `HasSufficientBalance` to take an account ID and an amount as input and return a boolean indicating whether the account has at least the specified amount.

## Exercise 5: Triggers

1. **Update Customer Last Modified Date**
    - Write a trigger `UpdateCustomerLastModified` to update the `LastModified` column of the `Customers` table to the current date whenever a customer's record is updated.

2. **Audit Log for Transactions**
    - Write a trigger `LogTransaction` to insert a record into an `AuditLog` table whenever a transaction is inserted into the `Transactions` table.

3. **Enforce Business Rules on Transactions**
    - Write a trigger `CheckTransactionRules` to ensure withdrawals do not exceed the balance and deposits are positive before inserting a record into the `Transactions` table.

## Exercise 6: Cursors

1. **Generate Monthly Statements**
    - Write a PL/SQL block using an explicit cursor `GenerateMonthlyStatements` to retrieve all transactions for the current month and print a statement for each customer.

2. **Apply Annual Fee to Accounts**
    - Write a PL/SQL block using an explicit cursor `ApplyAnnualFee` to deduct an annual maintenance fee from the balance of all accounts.

3. **Update Loan Interest Rates**
    - Write a PL/SQL block using an explicit cursor `UpdateLoanInterestRates` to fetch all loans and update their interest rates based on a new policy.

## Exercise 7: Packages

1. **Customer Management Package**
    - Create a package `CustomerManagement` with procedures for adding a new customer, updating customer details, and a function to get customer balance.

2. **Employee Management Package**
    - Create a package `EmployeeManagement` with procedures to hire new employees, update employee details, and a function to calculate annual salary.

3. **Account Operations Package**
    - Create a package `AccountOperations` with procedures for opening a new account, closing an account, and a function to get the total balance of a customer across all accounts.

## Database Schema

```sql
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);
```

## Sample Data Insertion

```sql

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (1, 'John Doe', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 1000, SYSDATE);

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 1500, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 1000, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 2, 'Checking', 1500, SYSDATE);

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (1, 1, SYSDATE, 200, 'Deposit');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (2, 2, SYSDATE, 300, 'Withdrawal');

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (1, 1, 5000, 5, SYSDATE, ADD_MONTHS(SYSDATE, 60));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));
```
