/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author binaya
 */
public class javaenumswitch {
    public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    
       public static void main(String args[])    
       {    
         Day[] DayNow = Day.values();    
           for (Day Now : DayNow)    
           {    
                switch (Now)    
                {    
                    case Sun:    
                        System.out.println("Sunday");    
                        break;    
                    case Mon:    
                        System.out.println("Monday");    
                        break;    
                    case Tue:    
                        System.out.println("Tuesday");    
                        break;         
                    case Wed:    
                        System.out.println("Wednesday");    
                        break;    
                    case Thu:    
                        System.out.println("Thursday");    
                        break;    
                    case Fri:    
                        System.out.println("Friday");    
                        break;    
                    case Sat:    
                        System.out.println("Saturday");    
                        break;    
                }    
            }    
        }    
}
