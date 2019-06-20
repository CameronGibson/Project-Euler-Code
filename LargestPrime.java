/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestprime;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Cameron
 */
public class LargestPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger big = new BigInteger("600851475143");
        long bigInt = big.longValue();
        System.out.println(bigInt);

        for (int i = 2; i < bigInt; i++) {
            while (bigInt % i == 0) {
                System.out.println(i + " ");
                bigInt = bigInt / i;
            }
        }
        if (bigInt > 2) {
            System.out.println(bigInt);
        }
    }
}
