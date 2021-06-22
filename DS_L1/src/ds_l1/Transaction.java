/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l1;

import java.util.Date;

/**
 *
 * @author syaam
 */
public class Transaction {
    private java.util.Date date;
    private String type;
    private double amount, balance;
    private String description;

    public Transaction(String type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = date.from(java.time.Instant.now());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return type+"\t"+amount+"\t"+balance+"\t"+description;
    }
    
    
}
