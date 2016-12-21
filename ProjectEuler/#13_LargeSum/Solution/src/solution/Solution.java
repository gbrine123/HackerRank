/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author gary.snow-brine
 * 
 * Project Euler #13: Large Sum
 * Work out the first ten digits of the sum of N 50-digit numbers.
 */
public class Solution {

    // The first 'x' numbers of the result.
    private static int FIRST_X_OUTPUT = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        doLargeSum();
    }

    /**
     * This method performs the logic of this class. (i.e. adds large numbers and outputs the first x (10) numbers of the result.
     */
    private static void doLargeSum() {
        /*
         * We will read from STDIN.
         */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // the number of 50-digit values
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < N; i++) {
            String s = in.next();   // the nth 50-digit value
            
            sum = addBigDecimal(sum, s);
        }
        in.close();
        
        System.out.println(getFirstX(sum, FIRST_X_OUTPUT));
    }

    /**
     * This method adds a value (as a String) to a BigDecimal.
     * @param bd    The BigDecimal to which to add
     * @param s     The String representation of the value of which to add
     * @return      The sum of the two parameters, as a BigDecimal
     */
    public static BigDecimal addBigDecimal(BigDecimal bd, String s) {
        return bd.add(new BigDecimal(s));
    }

    /**
     * This method returns the first x integers of a given BigDecimal, as a String.
     * @param bd    The BigDecimal of which to get the first x integers
     * @param x     The number of integers to return
     * @return      The first x integers of bd, as a String
     */
    public static String getFirstX(BigDecimal bd, int x) {
        String numAsString = bd.toString();
        return numAsString.substring(0, x);
    }
    
}
