/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yogita
 */
public class Area {
    int length;
	int breadth;
	
	
	public void setDim() {
		System.out.print("Enter the length:: ");
		Scanner scanner = new Scanner(System.in);
		this.length = scanner.nextInt();
		System.out.print("Enter the breadth:: ");
		this.breadth = scanner.nextInt();
	}
	
	
	public int getArea() {
		return length*breadth;
	}
}
