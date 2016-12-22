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

    static ArrayList<Integer> partition(ArrayList ar) {
        if (ar.size() <= 1) {
            return ar;
        }
        
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int p = ((Integer)ar.get(0)).intValue();
        for (int i = 1; i < ar.size(); i++) {
            int val = ((Integer) ar.get(i)).intValue();
            if (val < p) {
                left.add(val);
            } else {
                right.add(val);
            }
        }
        
        left = partition(left);
        right = partition(right);
        ArrayList<Integer> retList = new ArrayList<Integer>();
        for (Integer i : left) {
            retList.add(i);
        }
        retList.add(new Integer(p));
        for (Integer i : right) {
            retList.add(i);
        }
        printArray(retList)
        return retList;
    }
    
    static void quickSort(ArrayList<Integer> ar) {
        ArrayList<Integer> sortedList = partition(ar);
    }
    
    static void printArray(ArrayList<Integer> ar) {
        for (Integer n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(in.nextInt());
        }
        quickSort(ar);
    }
    
}
