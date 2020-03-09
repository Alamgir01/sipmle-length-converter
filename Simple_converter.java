 
package simple_converter;

import java.util.Scanner;

class Converter {
    
}
 
public class Simple_converter {

     
    public static void main(String[] args) {
        
        
        Scanner  input = new Scanner (System.in);   
        
        
        double   mm=1 , cm, m ,km ;
        
        double   in , ft , yeard , mile ;
        int n;
        
        
        System.out.println("1 for mm 2 for cm 3 for m 4 for km ");
        n = input.nextInt();
       
        
        switch(n){
        
            case 1 :  System.out.println("enter any value in milimeter");
                      mm = input.nextDouble();
                     
                      cm = mm * 0.1 ;
                      m = mm * 0.001 ;
                      km = m* 0.001 ;
                     
                      System.out.println("cm = "+cm );
                      System.out.println("m = "+m);
                      System.out.println("km = "+km);
            break;
            
            case 2 :  System.out.println("enter the value in centimeter");
                      cm = input.nextDouble();
                      
                      mm = cm * 10 ;
                      
                      m = cm *0.01 ;
                      
                      km = m * 0.001 ;
                    
                      
                      System.out.println("mm = "+mm );
                      System.out.println("m = "+m);
                      System.out.println("km = "+km);
            break;
            
            
            case 3 :  System.out.println("enter the value in meter");
                      m = input.nextDouble();
                      
                      
                      mm = m * 1000 ;
                      
                      cm = m * 100 ;
                      
                      km = m * 0.001 ;
                      
                      
                      System.out.println("mm = "+mm );
                      System.out.println("cm = "+cm);
                      System.out.println("km = "+km);
            break;
                      
             
            case 4 : System.out.println("enter the value in kilometer");
                     km = input.nextDouble();
                     
                     m = km * 1000 ;
                     
                     cm = m * 100 ; 
                     
                     mm = cm * 10 ;
                     
                     
                     
                         
                      System.out.println("mm = "+mm );
                      System.out.println("cm = "+cm);
                      System.out.println("m = "+m);
            break;
             
            
            
        
        
        }
        
    }
    
}
