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
        int[] ar = new int[100];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x < 100) {
                ar[x]++;
            }
        }
        in.close();
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
    
}
