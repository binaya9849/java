package email;

import java.util.Locale;
import java.util.Scanner;

public class email{
    private String fname;
    private String lname;
    private String password;
    private String email;
    private String department;
    private int mailboxcapacity = 500;
    private String alternateemail;
    private int defaultPasswordLength = 10;
    private  String companySuffix = "gmail.com";

    //constructor to receive the fname and lname
    public email(String fname, String lname){
        this.fname = fname;
        this.lname = lname;

        //call a method asking the department - return the department
        this.department = setDepartment();

        //call method that returns a random pasword
        this.password = randompassword(defaultPasswordLength);
        System.out.println("Your password is : "+ this.password);

        //combine leemnts to genterate email
        email = fname.toLowerCase()+"."+lname.toLowerCase() + "@" + department + "." + companySuffix;
    }
    //ask for department
private String setDepartment(){
        System.out.println("New worker:"+ fname + ".DEPARTMENT CODES \n enter the department \n 1 for sales \n 2 for development \n 3 for department \n 0 for none \n ENTER DEPARTMENT CODE");
        Scanner in = new Scanner((System.in));
        int depchoice = in.nextInt();
        if (depchoice == 1){
            return "sales";
        }
        else if(depchoice == 2 ){
            return "dev";
        }
        else if (depchoice ==3){
            return "acct";
        }
        else{
            return"";
        }
}
    //genertae random password
        private String randompassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        char[] password = new char[length];
        for(int i=0;i<length; i++){
            int rand =(int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mail box capacity
    public void setMailboxcapacity(int capacity){
        this.mailboxcapacity = capacity;
    }

    //set the alternate email
    public void setAlternateemail(String altEmail){
        this.alternateemail = altEmail;
    }

    //change password
    public void changepassword(String password){
        this.password = password;
    }

    public int getMailboxcapacity(){
        return mailboxcapacity;
    }
    public String getAlternateemail(){
        return alternateemail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "Dispaly name :" + fname + " " + lname +
                "\nCOmpany email:" + email +
                "\nMAILBOXCAPACITY:" + mailboxcapacity + "mb";
    }
}