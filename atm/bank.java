package atm;

import java.util.ArrayList;
import java.util.Random;

public class bank {
    //name
    private String name;
    // list of users
    private ArrayList<user> user;
    //
    private ArrayList<account> Accounts;

    /**
     * create a new bank object with empty lists of users and accounts
     * @param bank_of_harisiddhi    name of bank
     */
    public bank(String bank_of_harisiddhi) {
        this.name = name;
        this.Accounts = new ArrayList<account>();
        this.user = new ArrayList<user>();

    }

    /**
     * generate a new universal unique id for a user
     * @return  the uuid
     */
    public String getNewUserUUID() {
        //inits
        String uuid;

        Random rng = new Random();
        int len = 6;
        boolean nonUnqiue ;
        //continuing loop until new id
        do{
            //generate number
            uuid = "";
            for(int c=0; c<len ; c++  ){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }

            //check to make sure its unique
            nonUnqiue = false;
            for(user a: this.user){
                if(uuid.compareTo(a.getUUID())==0){
                    nonUnqiue = true;
                    break;
                }
            }

        }while(nonUnqiue);
        return uuid;
    }

    /**
     * generate a new universal unique id for a user
     * @return  the uuid
     */
    public String getNewAccountUUID() {
        //inits
        String uuid;

        Random rng = new Random();
        int len = 10;
        boolean nonUnqiue;
        //continuing loop until new id
        do{
            //generate number
            uuid = "";
            for(int c=0; c<len ; c++  ){
                uuid += ((Integer)rng.nextInt(10)).toString();
            }

            //check to make sure its unique
            nonUnqiue = false;
            for(user u : this.user){
                if(uuid.compareTo(u.getUUID())==0){
                    nonUnqiue = true;
                    break;
                }
            }

        }while(nonUnqiue);
        return uuid;
    }

    /**
     * create a new user of the bank
     * @param fname users fname
     * @param lname     usera last name
     * @param pin   users pin number
     * @return
     */
    public user addUser(String fname, String lname, String pin){
        //create a new user object and add to our list
        user newUser = new user(fname , lname ,pin ,this);
        this.user.add(newUser);

        //create savings account for user and the bank
        //accounts list
            account newAccount = new account("Savings", newUser, this);
            newUser.addAccount(newAccount);
            this.Accounts.add(newAccount );

            return newUser;
    }

    public user userlogin(String userid , String pin){
    //search through list of users
        for (user u : this.user){
            //check if used id is correct
            if(u.getUUID().compareTo(userid)== 0 && u.validatepin(pin)){
                return u;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public void addAccount(account newAccount) {

    }
}
