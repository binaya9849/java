/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author binaya
 */
public class NewClassoperators {
    public static void main(String[]args){
        int x = 10;
        int a= 10;
        int b=-10;
        int e = 20;
        //boolean
        boolean c=true;  
        boolean d=false;  
        //example ++ and  --
        System.out.println(x++);//10 (11)  
        System.out.println(++x);//12  
        System.out.println(x--);//12 (11)  
        System.out.println(--x);//10  
        System.out.println(x++ + ++x);//10+12=22  
        System.out.println(x++ + x++);//10+11=21  
        // example ` and !
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
        System.out.println(!c);//false (opposite of boolean value)  
        System.out.println(!d);//true  
        //arithmetic
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0  
        //left shift operator
        System.out.println(10<<2);//10*2^2=10*4=40  
        System.out.println(10<<3);//10*2^3=10*8=80  
        System.out.println(20<<2);//20*2^2=20*4=80  
        System.out.println(15<<4);//15*2^4=15*16=240  
        //right shift operator
        System.out.println(10>>2);//10/2^2=10/4=2  
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2  
        //>> vs >>>
         //For positive number, >> and >>> works same  
        System.out.println(20>>2);  
        System.out.println(20>>>2);  
        //For negative number, >>> changes parity bit (MSB) to 0  
        System.out.println(-20>>2);  
        System.out.println(-20>>>2); 
        //logical && and butwise |
        System.out.println(a<b&&a++<e);//false && true = false  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a<b&a++<e);//false && true = false  
        System.out.println(a);//11 because second condition is checked  
        //ternary
        int min=(a<b)?a:b;  
        System.out.println(min);  
        //operator
        a+=3;//10+3  
        System.out.println(a);  
        a-=4;//13-4  
        System.out.println(a);  
        a*=2;//9*2  
        System.out.println(a);  
        a/=2;//18/2  
        System.out.println(a);  
        //adding short
        short y=10;  
        short z=10;  
        //a+=b;//a=a+b internally so fine  
        y=(short) (y+z);//Compile time error because 10+10=20 now int  
        System.out.println(y); 
        
        
    }
    
}
