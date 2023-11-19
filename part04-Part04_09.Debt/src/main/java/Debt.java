/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double initialBalance,double initialInterestRate){
        balance = initialBalance;
        interestRate = initialInterestRate;
        
    }
    public void printBalance(){
        System.out.println(this.balance);   
    }
    
    public void waitOneYear(){
        this.balance *= this.interestRate;
    }
}
