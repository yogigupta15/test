/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Yogita
 */
public class Rectangle {
    int length;
	int breadth;
	
	
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public int area() {
		return length*breadth;
        }
    
}
