/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.pkg3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yogita
 */
public class Test33 {

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
		
		System.out.println(Arrays.toString(newArray));
		System.out.println("Select an element from the array to find its index:: ");
		int key = scanner.nextInt();
		
		int count = 0;
		for(int element:newArray) {
			if(element == key) {
				System.out.println("Index of " + key + " is:: " + count);
				break;
			}
			count++;
		}
    }
    
}
