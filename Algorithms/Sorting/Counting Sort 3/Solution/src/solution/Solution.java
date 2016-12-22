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
            String s = in.nextLine();
            
            ar[x]++;
        }
        in.close();
        
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += ar[j];
            }
            System.out.print(sum + " ");
        }
    }
    
}
