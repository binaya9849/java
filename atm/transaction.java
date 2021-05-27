package atm;

import java.util.Date;

public class transaction {
    //amount of this transaction
    private double amount;
    //time and date of this transaction
    private Date timestamp;
    //memo of this transaction
    private String memo;
    //account in which transaction was performed
    private account inaccount;

    public transaction(double amount, account inaccount){

        this.amount = amount;
        this.inaccount = inaccount;
        this.timestamp = new Date();
        this.memo = "";
    }

    /**
     * create new transaction
     * @param amount    amount transacted
     * @param memo  memo for transcaction
     * @param inaccount     acount the transaction belongs to
     */
    public transaction(double amount,String memo ,account inaccount){
        //call 2-arg constructor first
        this(amount, inaccount);

        //set the memo
        this.memo = memo;

    }

    /**
     * get amount of teansaction
     * @return  the amount
     */
    public double getamount() {
        return this.amount;
    }

    /**
     * get a string summarizing the transacation
     * @return  the summary string
     */
    public String getSummaryLine() {
        if (this.amount>=0){
            return String.format("%s : $%0.2f : %s", this.timestamp.toString(),this.amount , this.memo);
        }
        else {
            return String.format("%s : $(%0.2f) : %s", this.timestamp.toString(),-this.amount , this.memo);
        }
    }
}
