/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yogita
 */
public class Test51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		// Lambda expression to find sum
		Addition sum = (x, y) -> {
			long addSum = x + y;
			return addSum;
		};
		System.out.println("Enter the First number:: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second number:: ");
		int num2 = scanner.nextInt();
		
		
		System.out.println("The sum is:: " + sum.add(num1, num2));
    }
    
}
