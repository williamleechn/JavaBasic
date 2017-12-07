/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author libin
 */
public class BankAccount {
    //Data fields

    private String name, ic, passportNum;
    private double balance; //Account Balance
    private double totalDeposits;
    private double totalWithdraws;

    public BankAccount(String name, String ic, String passportNum, double startBalance) {
        this.name = name;
        this.ic = ic;
        this.passportNum = passportNum;
        balance = startBalance;

    }

    public void setDeposit(double amount) {
        balance += amount;
        totalDeposits += amount;
    }

    public void setWithdraw(double amount) {
        balance -= amount;
        totalWithdraws += amount;
    }

    /* displayData method displays the ending details of the savings account */
    public void displayData() {
        balance = Math.round(balance * 100.0) / 100.0;
        System.out.println(name);
        System.out.println(ic);
        System.out.println(passportNum);
        System.out.println("The ending balance is: $" + balance);
        System.out.println("Total amount of deposits: $" + totalDeposits);
        System.out.println("Total amount of withdraws: $" + totalWithdraws);
    }
}
