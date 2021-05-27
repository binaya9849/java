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
public class fibonaciwithoutrecursion {
    public static void main (String[]args){
        int n1 = 0, n2 = 1,n3 , i ,count = 10;
        System.out.println(n1+ "" + n2); //printing 0 and 1
        for(i = 2; i<count;++i){//loop start from 2 beacause 0 and 1 are printed
            n3 = n1 + n2;
            System.out.println(""+ n3);
            n1=n2;
            n2=n3;
            
        }
        
    }
    
}
