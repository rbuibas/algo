package com.rb.hr.misc;

import java.util.Scanner;

public class FineCalculation {
    
    private static final int D = 0;
    private static final int M = 1;
    private static final int Y = 2;

    private static final int level1FINE = 15;
    private static final int level2FINE = 500;
    private static final int level3FINE = 10000;

    private static int fineCalculation(int b[], int a[])
    {
        // b array is actual return date
        // a array is expected return date
        if (b[Y] < a[Y]) {
            // clearly before due date
            return 0;
        }
        else if (b[Y] > a[Y]) {
            // maybe got stolen
            return level3FINE;
        } // it clearly must be equal then
        else if (b[M] > a[M]) // lets check months
            return level2FINE * (b[M] - a[M]); // maybe they forgot
        else if (b[M] < a[M])
        { // this is how I really like it !
            return 0;
        } // 'tis the same month then ay'
        else if (b[D] > a[D]) // common now, on a few days delay, give 'em a slack
            return level1FINE * (b[D] - a[D]);
        else if (b[D] < a[D]) // phew!
            return 0;
        else
            return 0; // damn, spot on
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int returnDate[] = new int[3];
        int contractReturnDate[] = new int[3];
        
        for (int i = 0; i < 3; i++)
        {
            returnDate[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++)
        {
            contractReturnDate[i] = sc.nextInt();
        }
        System.out.println(fineCalculation(returnDate, contractReturnDate));     
    }
}