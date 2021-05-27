package atm;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class user {
    //first name of user
    private String fname;
    //last name of user
    private String lname;
    //id number of user
    private String uuid;
    //MD5 hash of users pin number
    private byte pinHash[];
    //list of account for user
    private ArrayList<account> accounts;

    /**
     *create a new user
     *fname : users first name
     *lname : users last name
     * pin : users pin number
     * thebank : bank object that the user is the  customer of
     * **/
    public user(String fname, String lname, String pin, bank thebank ){
        //set user's name
        this.fname= fname;
        this.lname = lname;

        //store the pins MD5 hash, rather than the original value, for
        // security reasons

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught no such algorithmexception");
            e.printStackTrace();
            System.exit(1);
        }
        //get a new, unique universal id for the user
        this.uuid = thebank.getNewUserUUID();

        //create empty list of accounts
        this.accounts = new ArrayList<account>();

        //print log message
        System.out.printf("new user %s, %s with id %s created", lname , fname, this.uuid );
    }

    /**
     *add account for the user
     * @param onAcct    the account to add
     */
    public void addAccount(account onAcct) {
    this.accounts.add(onAcct);
    }

    /**
     * return users id
     * @return  the uuid
     */
    public String getUUID(){
        return  this.uuid;
    }

    /**
     * check given pin matches users pin
     * @param apin   pin to check
     * @return  pin is valid or not
     */
    public boolean validatepin(String apin) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(apin.getBytes()),this.pinHash );
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught no such algorithmexception");
            e.printStackTrace();
            System.exit(1);
        }
        return false;
    }
    public String getFname(){
        return this.fname;
    }

    /**
     * print summaries for the accounts of this user
     */
    public void printaccountsummary() {
        System.out.printf("\n\n%s's accounts summary" , this.fname);
        for (int a=0; a < this.accounts.size();a++){
            System.out.printf("%d)%s\n",a +1 ,
                    this.accounts.get(a).getsummaryline());
        }
        System.out.println();
    }

    /**
     * get the number opf accounts to the user
     * @return  the number of accounts
     */
    public Object numaccounts() {
        return this.accounts.size();
    }

    /**
     * print transaction history from a particular account
     * @param accidx    index of account to use
     */
    public void printacctransactionhistory(int accidx) {
        this.accounts.get(accidx).printtranshistory();
    }

    /**
     *  get balance of particular account
     * @param fromacct  index of account to use
     * @return  balance of account
     */
    public double getaccbalance(int fromacct) {
        return this.accounts.get(fromacct).getBalance();
    }

    /**
     * get the uuid for the particular account
     * @param toacct       the index of account to use
     * @return  the uuid of the account
     */
    public Object getacctuuid(int toacct) {
        return this.accounts.get(toacct).getUUID();
    }

    public void addaccttransaction(int fromacct, double amount, String memo) {
        this.accounts.get(fromacct).addtransaction(amount , memo);
    }
}
