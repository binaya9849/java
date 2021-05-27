/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimpleprograms;
import java.util.Random;

/**
 *
 * @author binaya
 */
public class randomnumbergenerate {
    public static void main(String[]args){
        randomInts(5);
        randomInts(9,50,90);
        //getStreamOfRandomInts(30,50);
    }
    public static void randomInts(int num){
        Random random = new Random();
        random.ints(num).forEach(System.out::println);
    }
    //method that generates a stream of 9 integers between 50 to 90
    public static void randomInts(int num, int origin, int bound){
        Random random1 = new Random();
        random1.ints(num).forEach(System.out::println);
    }
    
}
