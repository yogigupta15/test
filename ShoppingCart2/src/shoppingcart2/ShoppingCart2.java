package shoppingcart2;
public class ShoppingCart2 {
    public static void main(String[] args) {
        String name;
        int age;
        if(args.length<2){
            System.out.println("Invalid arg list. You need 2 arguments.");
        }else{
            name=args[0];
            age=Integer.parseInt(args[1]);
            System.out.println("Name: " + name + "Age:" + age);
            
        }
        
    }
    
}
