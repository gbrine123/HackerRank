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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        in.close();
        
        int[] count = new int[100];
        for (int i = 0; i < n; i++) {
            int val = ar[i];
            if (val < 100) {
                count[val]++;
            }
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.println();
    }
    
}
