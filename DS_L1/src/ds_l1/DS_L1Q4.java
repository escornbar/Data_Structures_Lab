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
public class DS_L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account1 a =new Account1("George", 1122, 1000);
        a.setAnnualInterestRate(1.5);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        System.out.println("Account Holder: "+a.getCustomerName()+
                           "\nBalance: "+a.getBalance()+"\nMonthly Interest: "
                           +a.getMonthlyInterest()+"\nDate Account Created: "
                           +a.getDateCreated()+"\nTransactions: ");
        a.printTransactions();
    }
    
}
