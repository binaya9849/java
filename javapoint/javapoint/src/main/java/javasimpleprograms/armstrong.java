/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimpleprograms;

/**
 *
 * @author binaya
 */
public class armstrong {
    public static void main(String[]args){
        int c=0, a,temp, n=153;
        temp = n;
        while(n>0){
            a = n%10;
            n = n/10;
            c=c+(a*a*a);
        }
        if(temp ==c){
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not armstrong");
        }
    }
    
}
