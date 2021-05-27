/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ja bata 4mula tanxa ::  aani initiliaze ne gardeko jhyau lagera
 * @author binaya
 */
class Box {
        double width;
        double height;
        double depth;
        //computer and return volume
        double volume1(){
        return width* height * depth;
           }
        double volume2(){
        return width* height ;
           }
        //set dimension of box
        void setDim(double w, double h , double d){
        width = w;
        height = h;
        depth = d;
    }

    
}
        
