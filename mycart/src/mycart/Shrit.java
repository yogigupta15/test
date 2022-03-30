/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycart;

/**
 *
 * @author Yogita
 */
public class Shirt  extends Item {
    private char size;
    private char coloCode;
    
    public Shirt(double price, char size, char colorcode){
        super("shirt",price);
        this.size=size;
        this.colorCode=colorCode;
               
    }
    
}
