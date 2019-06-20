/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenfibonacci;

/**
 *
 * @author Cameron
 */
public class EvenFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final int MAX_VAL = 4000000;
       int fibNum = 1;
       int fibNum2 = 2;
       int total = 0;
       int fibNum3 = 0;
        
       while (fibNum3 < MAX_VAL){
           fibNum3 = fibNum + fibNum2;
           fibNum = fibNum2;
           fibNum2 = fibNum3;
           
           if (fibNum3 % 2 == 0){
               total = total + fibNum3;   
                  
           }
        
    
    }
   System.out.println(total + 2); //adding fibNum2 back to the total.
    }
    
}
