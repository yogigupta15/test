/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Yogita
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String custName = "marry Smith";
        String itemDesc = "shirt";
        String message;
        
        int quantity =2;
        double price=21.99;
        double tax =1.04;
        double total;
        
        
        
        message = custName +"wants to purchese a " + quantity +" " + itemDesc +" at " +price;
                System.out.println(message);
                total = quantity * price * tax;
                System.out.println(" Marry's total: " + total);
                
        
    }
    
}
