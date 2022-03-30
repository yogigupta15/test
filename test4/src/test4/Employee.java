/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author Yogita
 */
public class Employee {
    private int employeeID;
    private String employeeName;
	private float basicSalary;
	private float specialAllowance;
	private float hra;
	private float ta;
	private float tax = 2500;
	private float netSalary;
	private char designation;

	public Employee(int employeeID, String employeeName, float basicSalary, float hra, char designation) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.designation = designation;
	}
	public void calculateNetSalary() {
		if (designation == 'M') {
			ta = (20 / 100) * basicSalary;
			specialAllowance = 20000;
		} else {
			ta = (15 / 100) * basicSalary;
			specialAllowance = 12000;
		}
		netSalary = basicSalary + hra + specialAllowance + ta - tax;
		System.out.println("The net salary is:: " + netSalary);
    
}
}
