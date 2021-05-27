/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author binaya
 */
public class ClassLoader {
    public static void main(String[]args){
        //lets print classloader name of current class
        //application/system classloader will load in this class
        Class c =ClassLoader.class;
        System.out.println(c.getClassLoader());
        //if we print the classloader of string , it will print null beacause it is an 
        //in-built class which is found in rt.jar, so it is loaded by bootstrap classloader
        System.out.println(String.class.getClassLoader());
    }
    
}
