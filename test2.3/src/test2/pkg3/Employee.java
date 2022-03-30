/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2.pkg3;

/**
 *
 * @author Yogita
 */
public class Employee {
    int salary;
	int hours;
	public void getInfo(int salary, int hours) {
		this.salary = salary;
		this.hours = hours;
	}
	
	public void addSal() {
		if(this.salary < 500)
			this.salary+=10;
	}
	public void addWork() {
		if(this.hours > 6)
			this.salary+=5;
	}
    
}
