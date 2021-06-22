/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l1;

import java.util.ArrayList;

/**
 *
 * @author syaam
 */
public class Account1 extends Account{
    private String customerName;
    private ArrayList<Transaction> transactions=new ArrayList<Transaction>();

    public Account1(String customerName, int id, double balance) {
        super(id, balance);
        this.customerName = customerName;
    }
    
    public boolean withdraw(double amount){
        if(amount<super.getBalance()){
            super.setBalance(super.getBalance()-amount);
            transactions.add(new Transaction("W", amount, super.getBalance(), "Withdrawal"));
            return true;
        }else{
            System.out.println("No enough balance.");
            return false;
        }
    }
    
    public void deposit(double amount){
        super.setBalance(super.getBalance()+amount);
        transactions.add(new Transaction("D", amount, super.getBalance(), "Deposit"));
    }

    public String getCustomerName() {
        return customerName;
    }

    public void printTransactions() {
        for(int i=0;i<transactions.size();i++){
            System.out.println((i+1)+". "+transactions.get(i).toString());
        }
    }
}
