package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch13.exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.exceptions.SsnNotValidException;

/**
 * Defines a {@link Account} class
 * @author Mike
 * @version 0.1
 * @since 0.1
 *
 *
 */


public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String  lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    /*
     * Public API
     */

    public void deposit(double amount) throws NegativeAmountException {
        try{
            if (amount < 0){
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            System.out.println("Amount" + amount + "successfully deposited.");   //logging
        }catch (NegativeAmountException e){
            System.out.println("Error. Amount" + amount + "can not be negative");
            //e.printStackTrace();
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws SsnNotValidException, InsufficientBalanceException, NegativeAmountException {
        try {
            if (!isSsnValid(ssn)){
                throw new SsnNotValidException(ssn);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            if (amount < 0){
                throw new NegativeAmountException(amount);
            }

            balance -= amount;
            System.out.println("Amount" + amount + "successfully withdrawn.");   //logging
        } catch (SsnNotValidException | InsufficientBalanceException | NegativeAmountException e){
            System.err.println("error " + e.getMessage());
            //throw e;
        }
    }

    /*
    Returns the balance of the {@link Account}
     */


    public double getAccountBalance() {
        System.out.println("The account balance was returned");     //logging
        return getBalance();
    }

    public String accountToString() {
        return "("+ id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " +balance + ")";
    }





    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }



}
