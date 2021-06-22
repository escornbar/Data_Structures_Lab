/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l1;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author syaam
 */
public class Account {
    private int id=0;
    private double balance=0;
    private static double annualInterestRate=0;
    private Date dateCreated;

    public Account() {
        dateCreated = dateCreated.from(Instant.now());
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = dateCreated.from(Instant.now());
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate()/100)/12;
    }
    
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    
    public boolean withdraw(double amount){
        if(amount<balance){
            balance=balance-amount;
            return true;
        }else{
            System.out.println("No enough balance.");
            return false;
        }
    }
    
    public void deposit(double amount){
        balance=balance+amount;
    }
}
