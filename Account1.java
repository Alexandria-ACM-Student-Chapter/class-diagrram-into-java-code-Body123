/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Wafaa
 */
public class Account1 {
    private String id;
    private String name;
    private int balance;
    public Account1(String id,String name){
        this.id=id;
        this.name=name;
        
    }
    public Account1(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }
    public int credet(int amount){
        return this.balance=amount+this.balance;
    }
    public int debit(int amount){
        if(amount<=balance)
            return balance=balance-amount;
        else{
            System.out.println("Amount exceedad balance");
            return balance;
        
        }
        
    }
    public int credet(Account1 another,int amount){
        if(amount<=balance)
            return another.balance=  amount;
        else{
            System.out.println("Amount exceedad balance");
            return balance;
        }
        
    }
    public String tostring() {
        String s="\"Account [id"+this.getId()+"name"+this.getName()+"balance"+this.getBalance()+" ]" ;
        
        return s;
    
    }
    
}
