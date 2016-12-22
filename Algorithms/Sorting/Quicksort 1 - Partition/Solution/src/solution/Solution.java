/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gary.snow-brine
 */
public class Solution {

    static void partition(int[] ar) {
        int p = ar[0];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        for (int i = 0; i < ar.length; i++) {
            int val = ar[i];
            if (val < p) {
                left.add(val);
            } else if (val == p) {
                equal.add(val);
            } else {
                right.add(val);
            }
        }
        
        printArray(left.toArray(new Integer[left.size()]));
        printArray(equal.toArray(new Integer[equal.size()]));
        printArray(right.toArray(new Integer[right.size()]));
        
    }
    
    static void printArray(Integer[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        //System.out.println("");
    }
    
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
        partition(ar);
    }
    
}
