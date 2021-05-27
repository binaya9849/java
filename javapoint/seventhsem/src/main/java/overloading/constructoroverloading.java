/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author binaya
 */

class OverloadDemo{
    void test(){
        System.out.println("no parameters");
    }
    //test for one integer parameter
    int test(int a){
        System.out.println("a:" + a);
        return a ;
    }
    //2 integer parameter
    int test(int a , int b){
        System.out.println("a and b:" +a +"" + b);
        
        return a + b ;
    }
    
    //double parameter
    double test (double a){
        System.out.println("double a:" + a);
        return a * a ;
    }
}
class constructoroverloading {
    public static void main(String[]args){
        OverloadDemo ob = new OverloadDemo();
        double result;
        
        //call version of test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123 ,25);
        System.out.println("result of ob.test(123 , 125)"+ result);
    }
    
}
