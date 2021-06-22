/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l1;

/**
 *
 * @author syaam
 */
public class DS_L1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account Ali=new Account(1122, 20000);
        Ali.setAnnualInterestRate(4.5);
        Ali.withdraw(2500);
        Ali.deposit(3000);
        System.out.println("Balance: "+Ali.getBalance()+"\nMonthly Interest: "
                            +Ali.getMonthlyInterest()+"\nDate Account Created: "
                            +Ali.getDateCreated());
    }
    
}
