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
 */
public class Solution {

    public static void insertionSortPart2(int[] ar) {
        int numShifts = 0;
        
        for (int i = 1; i < ar.length; i++) {
            int elem = ar[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (ar[j] > elem) {
                    ar[j + 1] = ar[j];
                    numShifts++;
                } else {
                    ar[j + 1] = elem;
                    break;
                }
            }
            if (j < 0) {
                ar[0] = elem;
            }
        }
            
        System.out.println(numShifts);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);
    }
}
