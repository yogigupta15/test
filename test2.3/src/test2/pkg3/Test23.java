/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Yogita
 */
public class Test23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Employee employee = new Employee();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your salary:: ");
		int salary = scanner.nextInt();
		System.out.print("Enter the number of working hours per day:: ");
		int hours = scanner.nextInt();
		employee.getInfo(salary, hours);
		employee.addSal();
		employee.addWork();
		System.out.println("Employee revised salary is:: " + employee.salary);

    }
    
}
