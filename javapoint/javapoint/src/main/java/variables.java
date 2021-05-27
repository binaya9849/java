/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author binaya
 */
public class variables {
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        float f = a;
        float d = 10.5f;
        //overflow byte
        byte g = (byte)a;
        //compile time error
        int e= (int)d;
        //add 2 numbers
        int c = a+ b ;
        System.out.println(c);
        //widening
        System.out.println(f);
        //typecasting
        System.out.println(a);
        System.out.println(d);
        //overflow
        System.out.println(g);
        
        
        
    }
    
}
