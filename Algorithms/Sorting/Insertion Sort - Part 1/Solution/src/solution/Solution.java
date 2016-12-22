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

    public static void insertIntoSorted(int[] ar) {
        int num = ar[ar.length - 1];
        
        int i = 0;
        for (i = ar.length - 2; i >= 0; i--) {
            if (ar[i] > num) {
                ar[i + 1] = ar[i];
            } else {
                ar[i + 1] = num;
                break;
            }
            printArray(ar);
        }
        if (i < 0) {
            ar[0] = num;
        }
        printArray(ar);
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
        insertIntoSorted(ar);
    }
    
    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
}
