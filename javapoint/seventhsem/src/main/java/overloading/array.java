/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *to find the smallest array in the list
 * @author binaya
 */
public class array {
    public static void main(String[] args) {  
        int [] arr = new int [] {25, 11, 7, 75, 56};   
        int min = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  
    
}
