/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yogita
 */
public class Test31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the Array:: ");
		int size = scanner.nextInt();
		int newArray[] = new int[size];
		System.out.println("Please enter the elements:: ");
		for(int i = 0 ; i < size ; i++) {
			newArray[i] = scanner.nextInt();
			sum+=newArray[i];
		}
		
		System.out.println("The Average of the array elements is:: " + (sum/size));	
		
    }
    
}
