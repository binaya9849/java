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
public class createobject {
 void show()    
{    
System.out.println("A new object created.");    
}    
public static void main(String[] args)   
{   
try  
{  
//creating an instance of Class class  
Class cls = Class.forName("CreateObjectExample4");   
//creates an instance of the class using the newInstance() method  
createobject obj = (createobject) cls.newInstance();   
//invoking the show() method  
obj.show();   
}   
catch (ClassNotFoundException e)   
{   
e.printStackTrace();   
}   
catch (InstantiationException e)   
{   
e.printStackTrace();   
}   
catch (IllegalAccessException e)   
{   
e.printStackTrace();   
}   
}   
}
