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
public class Order {
    static final char CORP ='C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT ='N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;
    public Order(String name, double total, String state, char custType){
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
        
    }
    public String getDiscount(){
        return Double.toString(discount)+ "%";
    }
    public void calcDiscount(){
        switch (custType) {
            case NONPROFIT:
                discount=(total>900)?10.00:5.00;
                break;
            case PRIVATE:
                discount=(total>500)?7.00:4.00;
                break;
            case CORP:
                discount=(total>1000)?3.00:5.00;
                break;
            default:
                System.out.println("Invalid customer type.");
                break;
        }
    }
}
