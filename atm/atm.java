package atm;

import java.util.Scanner;

public class atm {
    public static void main(String []args){
        //init scanner
        Scanner sc = new Scanner(System.in);

        //init the bank
        bank thebank = new bank("bank of harisiddhi");

        //add a user to bank, which creates saving account
        user auser= thebank.addUser("binay", "maharjan","1234");

        //add checking accounts fotr user
        account newAccount= new account("checking", auser, thebank);
        auser.addAccount(newAccount);
        thebank.addAccount(newAccount);

        user curuser;
        while(true){
            //stay in login prompt until sucessful
            curuser = atm.mainmenuprompt(thebank, sc);

            //stay in main menu until user quit
            atm.printusermenu(curuser, sc); //sc = scanner
        }

    }

    /**
     * login menu
     * @param thebank   the bank object whose acount to use
     * @param sc    scanner object to use for user input
     * @return  authentication user object
     */
    public static user mainmenuprompt(bank thebank , Scanner sc){
        //inits
        String userid;
        String pin;
        user authuser;

        //prompt user for user ID/pin combo until a correct one is reached
        do {
            System.out.printf("\n\nWelcome to %s\n\n", thebank.getName());
            System.out.println("enter user id:" );
            userid = sc.nextLine();
            System.out.printf("Enter pin:");
            pin = sc.nextLine();

            //try to get user ibject corresponding to id and pin combo
            authuser = thebank.userlogin(userid, pin);
            if(authuser == null){
                System.out.println("incorrect user id/pin number" + "Please try again.");
            }
        }while(authuser == null );//continue looping until sucessful looping

        return authuser;
    }

    /**
     * process a fund deposit to account
     * @param theuser   the logged-in user object
     * @param sc    scanner object used in for user input
     */
    public  static  void printusermenu(user theuser, Scanner sc){
        //print a summary of users account
        theuser.printaccountsummary();

        //init
        int choice;

        //user menu
        do {
            System.out.printf("Welcome %s, what would u like to do?" ,theuser.getFname());
            System.out.println("1) show the transaction history ");
            System.out.println("2) withdraw ");
            System.out.println("3) Deposit");
            System.out.println("4) transfer");
            System.out.println("5) quit");
            System.out.println();
            System.out.println("enter choice:");
            choice = sc.nextInt();

            if (choice < 1 || choice >5){
                System.out.println("invalid choice. please chose 1 - 5");
            }
        }while(choice < 1 || choice >5);

        //process the choice
        switch (choice){
            case 1 :
                atm.showtransactionhistory(theuser, sc);
                break;
            case 2:
                atm.withdraw(theuser, sc);
                break;
            case 3 :
                atm.despositfunds(theuser, sc);
                break;
            case 4 :
                atm.transferfund(theuser, sc);
                break;
            case 5:
                //gobble up the rest of previous input
                sc.nextLine();
                break;
        }
        //rediaplay menu unless users want to quit
        if (choice != 5){
            atm.printusermenu(theuser , sc);
        }
    }

    private static void despositfunds(user theuser, Scanner sc) {
        //inits
        int toacct;
        double amount;
        double acctbal;
        String memo;


        //get the account to transfer from
        do {
            System.out.printf("enter the number (1-%d) of the account" + "to deposit in:", theuser.numaccounts());
            toacct=sc.nextInt()-1;
            if (toacct < 0 || toacct >= theuser.numaccounts()){
                System.out.println("invalid account. please try again");
            }
        }while (toacct < 0 || toacct >= theuser.numaccounts());
        acctbal = theuser.getaccbalance(toacct);

        //get the amount to transfer
        do {
            System.out.printf("enter the amount to transfer(max %0.02f): $", acctbal);
            amount=sc.nextDouble();
            if (amount<0){
                System.out.println("amount must be greater than zero "); }
        }while (amount < 0 );

        //gobble up the rest of previous input
        sc.nextLine();

        //get the memo
        System.out.print("Enter a memo:");
        memo = sc.nextLine();

        //do the withdraw
        theuser.addaccttransaction(toacct, -1*amount, memo);
    }

    /***
     * process a fund withdraw from account
     * @param theuser   the logged in user object
     * @param sc    the scanner onject used for user input
     */
    private static void withdraw(user theuser, Scanner sc) {
        //inits
        int fromacct;
        double amount;
        double acctbal;
        String memo;

        //get the account to transfer from
        do {
            System.out.printf("enter the number (1-%d) of the account" + "to withdraw from",theuser.numaccounts());
            fromacct=sc.nextInt()-1;
            if (fromacct < 0 || fromacct >= theuser.numaccounts()){
                System.out.println("invalid account. please try again");
            }
        }while (fromacct < 0 || fromacct >= theuser.numaccounts());
        acctbal = theuser.getaccbalance(fromacct);

        //get the amount to transfer
        do {
            System.out.printf("enter the amount to withdraw (max %0.02f): $", acctbal);
            amount=sc.nextDouble();
            if (amount<0){
                System.out.println("amount must be greater than zero "); }
            else if(amount > acctbal){
                System.out.printf("amount must not be greater than\n" + "balance of $%.02f.\n");
            }
        }while (amount < 0 || amount > acctbal);

        //gobble up the rest of previous input
        sc.nextLine();

        //get the memo
        System.out.println("Enter a memo:");
        memo = sc.nextLine();

        //do the withdraw
        theuser.addaccttransaction(fromacct, -1*amount, memo);
    }

    /**
     * process transfering funds from one account to another
     * @param theuser   the logged in user object
     * @param sc    the scanner object used for user input
     */
    public static void transferfund(user theuser, Scanner sc) {
        //inits
        int fromacct;
        int toacct;
        double amount;
        double acctbal;

        //get the account to transfer from
        do {
            System.out.printf("enter the number (1-%d) of the account" + "to trasnfer from",theuser.numaccounts());
            fromacct=sc.nextInt()-1;
            if (fromacct < 0 || fromacct >= theuser.numaccounts()){
                System.out.println("invalid account. please try again");
            }
        }while (fromacct < 0 || fromacct >= theuser.numaccounts());
        acctbal = theuser.getaccbalance(fromacct);

        //get the account to transfer to
        do {
            System.out.printf("enter the number (1-%d) of the account" + "to trasnfer to");
            toacct=sc.nextInt()-1;
            if (toacct < 0 || toacct >= theuser.numaccounts()){
                System.out.println("invalid account. please try again");
            }
        }while (toacct < 0 || toacct >= theuser.numaccounts());

        //get the amount to transfer
        do {
            System.out.printf("enter the amount to transfer(max %0.02f): $", acctbal);
            amount=sc.nextDouble();
            if (amount<0){
                System.out.println("amount must be greater than zero "); }
            else if(amount > acctbal){
                System.out.printf("amount must not be greater than\n" + "balance of $%.02f.\n");
            }
        }while (amount < 0 || amount > acctbal);
        // finally transfer
        theuser.addaccttransaction(fromacct, -1 * amount , String.format("transfer to account %s", theuser.getacctuuid(toacct)));
        theuser.addaccttransaction(toacct,  amount , String.format("transfer to account %s", theuser.getacctuuid(fromacct)));
    }

    

    /**
     * show transaction history for the account
     * @param theuser   the logged-in user object
     * @param sc    the scanner object used for user input
     */
    public static void showtransactionhistory(user theuser, Scanner sc) {
        int theacct;
        //get account whose transaction hostory to look at
        do {
            System.out.printf("Enter number of account(1-%d) of the account"+ "whose transactions we want to see", theuser.numaccounts());
            theacct = sc.nextInt()-1;
            if (theacct < 0 || theacct >= theuser.numaccounts()){
                System.out.println("invalid account. please try again");
            }
        }
        while(theacct < 0 || theacct >= theuser.numaccounts());

        //print transaction history
        theuser.printacctransactionhistory(theacct);
    }
}
