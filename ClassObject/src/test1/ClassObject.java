/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Yogita
 */
public class ClassObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.name = "John";
        e1.eid = 101;
	Student s1 = new Student();
	Student s2 = new Student();
	s1.name = "Jatin";
	s1.address = "Paris";
		
	s2.name = "Prince";
	s2.address = "Tokyo";
		
	System.out.println("Name:: " + s1.name + "\nAddress:: " + s1.address);
		
        System.out.println("Name:: " + s2.name + "\nAddress:: " + s2.address);
    }
    
}
