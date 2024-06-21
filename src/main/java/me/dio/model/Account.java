package me.dio.model;

import java.util.Objects;

public class Account {
    private String number;
    private String agency;
    private double balance;
    private double limit;

    public Account() {
    }

    public Account(String number, double limit, double balance, String agency) {
        this.number = number;
        this.limit = limit;
        this.balance = balance;
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
