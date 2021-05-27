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
public class compareobejcts {
    //hash code 
    public static void main(String[]args){
        //creating two instances of the employee class
        Employee emp1= new Employee(918,"maria");
        Employee emp2= new Employee(918,"maria");
        //invoking hashcode() method;
        int a = emp1.hashCode();
        int b = emp2.hashCode();
        System.out.println("hashcode of emp1=" + a);
        System.out.println("hashcode of emp2=" + a);
        System.out.println("comparing objects emp1 and emp2=" + emp1.equals(emp2));
    }
    
}
