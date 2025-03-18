package com.mirage.mirage_bank.model;

import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDate;

// map to class to PostgreSQL database
@Entity
@Table
public class CheckingAccount {

    @Id
    @SequenceGenerator(
            name = "checking_sequence",
            sequenceName = "checking_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "checking_sequence"
    )
    private long id;
    private double balance;
    private LocalDate creationDate;
    private String accountNumber;
    private String status;
    private String accountHolder;

    @ElementCollection
    private List<Double> transactions;


    // constructors

    public CheckingAccount() {
    }

    public CheckingAccount(long id, double balance, List<Double> transactions, LocalDate creationDate, String accountNumber, String status, String accountHolder) {
        this.id = id;
        this.balance = balance;
        this.transactions = List.of();
        this.creationDate = creationDate;
        this.accountNumber = accountNumber;
        this.status = status;
        this.accountHolder = accountHolder;
    }

    public CheckingAccount(double balance, List<Double> transactions, LocalDate creationDate, String accountNumber, String status, String accountHolder) {
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

    public List<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Double> transactions) {
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

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
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
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}