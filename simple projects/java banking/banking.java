import java.awt.desktop.SystemSleepEvent;
import java .util.Scanner;
public class banking{
    public static void main(String[]args){
         //TODO autogenerated method stub
    Bankaccount obj1 = new Bankaccount("XYZ", "BA0001");
    obj1.showMenu();
     }
}
class Bankaccount
{
    int balance;
    int previoustransaction;
    String customername;
    String customerid;

    Bankaccount(String cname,String cid){
        customername = cname;
        customerid = cid;
    }
    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previoustransaction = amount;
        }
    }
    void withdraw(int amount2){
        if(amount2 != 0){
            balance = balance - amount2;
            previoustransaction = -amount2;
        }
    }
    void getPrevioustransaction(){
        if(previoustransaction> 0){
            System.out.println("Deposited" + previoustransaction);
        }
        else if(previoustransaction< 0){
            System.out.println("Deposited" +  Math.abs(previoustransaction));
        }
        else{
            System.out.println("no transaction");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" + customername);
        System.out.println("Welcome" + customerid);
        System.out.println("\n");
        System.out.println("A. check Balance");
        System.out.println("B. Deposit" );
        System.out.println("C. Withdraw" );
        System.out.println("D. Previous transaction" );
        System.out.println("E. Exit" );

        do{
            System.out.println("=================================================================" );
            System.out.println("Enter an option" );
            System.out.println("=======================================================" );
            option = scanner.next().charAt(0);
            System.out.println("E. Exit" );

            switch(option){
                case 'A':
                    System.out.println("=================================================================" );
                    System.out.println("Balance = " + balance );
                    System.out.println("=======================================================" );
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("=================================================================" );
                    System.out.println("enter an amount to be deposited:");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("=======================================================" );
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("=================================================================" );
                    System.out.println("enter an amount to be withdrawn:");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("=======================================================" );
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("=================================================================" );
                    getPrevioustransaction();
                    System.out.println("=======================================================" );
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("***************************");
                    break;

                    default:
                    System.out.println("Invalid option!! . please enter agin");
                    break;
            }
        }
        while(option != 'E');{
            System.out.println("thgank you for using our system");
        }
    }
}