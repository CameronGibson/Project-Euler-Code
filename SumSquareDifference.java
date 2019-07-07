/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsquaredifference;

/**
 *
 * @author Cameron
 */
public class SumSquareDifference {

    public static int number = 0;
    public static int square;
    public static int squareTotal;
    public static int addTotal;
    public static int difference;
    public static int squaredAddTotal;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (number != 100) {
            number++;
            addTotal += number;
            square = number * number;
            squareTotal += square;
        }
            squaredAddTotal = addTotal * addTotal;
            difference = squaredAddTotal - squareTotal;
            System.out.println(difference);
    }

}
