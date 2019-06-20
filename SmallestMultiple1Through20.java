/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestmultiple1through20;

import java.util.Scanner;
import java.io.*;
   import java.util.*; 
/**
 *
 * @author Cameron
 */
public class SmallestMultiple1Through20 {
   
    /**
     * @param args the command line arguments
     */
    




    
  public static void main(String[] args){
      
      int lower, higher;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter lower.");
      lower = input.nextInt();       //enter 1
      System.out.println("Enter higher.");
      higher = input.nextInt();     //enter 20
      boolean flag;
      for(int i=2;;i++){
          flag = true;
          for(int j=lower; j<=higher; j++){
              if(i%j!=0) flag = false;
          }
          if (flag == true){
              System.out.println(i); 
              break;
          }
      }
      
  }
    
}
    
    

