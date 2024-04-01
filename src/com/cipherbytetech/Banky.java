package com.cipherbytetech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of ₹" + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public boolean withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful.");
            return true;
        } else {
            System.err.println("Insufficient funds or invalid amount for withdrawal.");
            return false;
        }
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber, accountHolderName);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Balance: ₹" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

public class Banky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nWelcome to BankY");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNumber = scanner.next();
                    System.out.print("Enter account holder name: ");
                    String accHolderName = scanner.next();
                    bank.createAccount(accNumber, accHolderName);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String depositAccNumber = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String withdrawAccNumber = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    String balanceAccNumber = scanner.next();
                    bank.displayBalance(balanceAccNumber);
                    break;
                case 5:
                    System.out.println("Thank you for using BankY. Goodbye!Have a nice day");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid choice. Please try again.");
            }
        }
    }
}