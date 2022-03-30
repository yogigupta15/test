/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import java.util.Scanner;

/**
 *
 * @author Yogita
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char designation = ' ';
		Scanner scanner = new Scanner(System.in);

		// Collecting the information
		System.out.println("Please enter your employee ID:: ");
		int eid = scanner.nextInt();
		System.out.println("Please enter your name:: ");
		String name = scanner.next();
		System.out.println("Please enter your basic salary:: ");
		float basicSalary = scanner.nextFloat();
		System.out.println("Please enter your HRA:: ");
		float HRA = scanner.nextFloat();
		
		// Collecting input for designation
		int x = 1;
		while (x != 0) {
			System.out.println("Select the option:1. Manager 2. Assistant Manager: ");
			int option = scanner.nextInt();
			
			switch (option) {
				case 1: {
					designation = 'M';
					x=0;
					break;
				}
				case 2: {
					designation = 'A';
					x=0;
					break;
				}
				default: {
					System.out.println("Enter valid option");
				}
			}
		}
		Employee employee = new Employee(eid, name, basicSalary, HRA, designation);
		
		employee.calculateNetSalary();
        
    }
    
}
