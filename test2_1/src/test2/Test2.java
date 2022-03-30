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
public class Test2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,15);
		Rectangle rectangle2 = new Rectangle(16,13);
		
		System.out.println("Area of Rectangle 1:: " + rectangle1.area());
		System.out.println("Area of Rectangle 2:: " + rectangle2.area());
    }
    
}
