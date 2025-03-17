package com.mirage.mirage_bank.model;

import java.util.List;
import java.time.LocalDate;

public class CheckingAccount {

    private long id;
    private double balance;
    private List<Transaction> transactions;
    private LocalDate creationDate;
    private String accountNumber;
    private String status;
    private User accountHolder;

    public CheckingAccount(long id, double balance, List<Transaction> transactions, LocalDate creationDate, String accountNumber, String status, User accountHolder) {
        this.id = id;
        this.balance = balance;
        this.transactions = transactions;
        this.creationDate = creationDate;
        this.accountNumber = accountNumber;
        this.status = status;
        this.accountHolder = accountHolder;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", transactions=" + transactions +
                ", creationDate=" + creationDate +
                ", accountNumber='" + accountNumber + '\'' +
                ", status='" + status + '\'' +
                ", accountHolder=" + accountHolder +
                '}';
    }
}

