/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Scanner;

/**
 *
 * @author gary.snow-brine
 * 
 * This class provides a solution for the Project Euler #9: Special Pythagorean Triplet challenge.
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] squares = new int[3001];
        long[] solutions = new long[3001];
        for (int i = 1; i <= 3000; i++) {
            squares[i] = i * i;
            solutions[i] = 0;
        }
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            
            if (solutions[n] != 0) {
                System.out.println(solutions[n]);
            } else {
            
                boolean found = false;
                int c = 0;
                int b = 0;
                int a = 0;
                long maxProd = -1;
                for (c = (n - 3); (c > 2) && (!found); c--) {
                    int temp = n - c - 1;
                    for (b = (temp < c) ? temp : (c - 1); (b > 1) && (!found); b--) {
                        a = n - c - b;
                        if (a < b) {
                            int cSquared = squares[c];
                            int aSquared = squares[a];
                            int bSquared = squares[b];
                            if ((aSquared + bSquared) == cSquared) {
                                //found = true;
                                long prod = a * b * c;
                                if (prod > maxProd) {
                                    maxProd = prod;
                                }
                            }
                        }
                    }
                }
            
                System.out.println(maxProd);
                solutions[n] = maxProd;
            }
        }
    }
    
}
