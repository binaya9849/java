/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * makadox k ko volume ho ne thaha xaina
 * @author binaya
 */
public class exampleofclass{
    public static void main(String[]args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        //initialize each box
        mybox1.setDim(10,20,30);
        mybox2.setDim(4,5, 6);
        
        //get volume of box
        vol = mybox1.volume1();
        System.out.println("Volume1 is:" + vol);
        
        //get volume of second box
        vol = mybox2.volume2();
        System.out.println("Volume2 is:" + vol);
    } 
    
}
