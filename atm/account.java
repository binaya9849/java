package atm;

import java.util.ArrayList;

public class account {
    //name of account
    private String name;
    //account id number
    private String uuid;
    //user objects that owns the account
    private user holder;
    //list of transaction for this account
    private ArrayList<transaction> transaction;

    /**
     *
     * @param name   name of the user
     * @param holder    user object that holds this account
     * @param thebank   bank that issues that account
     */
    public account(String name, user holder,bank thebank ){
        //state the account name and holder
        this.name = name;
        this.holder = holder;

        //get next account
        this.uuid = thebank.getNewAccountUUID();

        //initialize transaction to empty array list
        this.transaction = new ArrayList<transaction>();
    }

    /**
     * get the account id
     * @return  the uuid
     */
    public String getUUID() {
        return this.uuid;
    }

    /**
     * get summary line for the account
     * @return  string summary
     */
    public Object getsummaryline() {
        //get the account's balance
        double balance  = this.getBalance();

        //format the summary in line depending on whether the balance is neagative
        if (balance >=0){
            return String.format("%s: $%0.2f :", this.uuid , balance, this.name);
        }else{
            return String.format("%s: $(%0.2f) :", this.uuid , balance, this.name);
        }
    }

    public double getBalance(){
        double balance = 0;
        for(transaction t : this.transaction){
            balance += t.getamount();
        }
        return balance;
    }

    /**
     * print transaction istory of account
     */
    public void printtranshistory() {
        System.out.printf("\ntransaction history for account %s\n", this.uuid);
        for (int t = this.transaction.size()-1; t>=0 ; t--){
            System.out.println(this.transaction.get(t).getSummaryLine());
        }
        System.out.println();
    }

    /**
     * add a new transaction in this account
     * @param amount    the amount transaction
     * @param memo  the transaction memo
     */
    public void addtransaction(double amount, String memo) {
        //create a new transaction object and add it to our list
        transaction newtrans = new transaction(amount,memo,this);
        this.transaction.add(newtrans);
    }
}
