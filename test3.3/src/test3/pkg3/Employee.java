/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3.pkg3;

/**
 *
 * @author Yogita
 */
public class Employee {
    private int eid;
	private String name;
	private String address;
	
	public Employee(int eid, String name, String address) {
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
	public void displayEmployee() {
		System.out.println("Employee id: " + this.eid + "\nEmployee name: " + this.name + "\nEmployee address: " + this.address);
        } 
}
