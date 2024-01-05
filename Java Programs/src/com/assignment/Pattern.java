package com.assignment;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	
		        // Scanner class for taking user input
//		        Scanner sc = new Scanner(System.in);
//		        int n = sc.nextInt();

		        // for loop for the number of rows
		        for (int i = 1; i <= 6 ; i++) 
		        {
		            // for loop for columns
		            for (int j = 1; j <= i; j++) 
		            {
		                System.out.print("1"); //printing '1' with respect to the row number
		            }
		            System.out.println();
		        }
		    }
}