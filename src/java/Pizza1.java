public class Pizza1 {
    public static void main (String [] args){
        // Make 3 pizza objects using the Pizza blueprint
        Pizza p1 = new Pizza("Margherita", "Large",  8.50);
        Pizza p2 = new Pizza("Pepperoni",  "Medium", 7.00);
        Pizza p3 = new Pizza("Hawaiian",   "Small",  5.50);
        
        // Print each pizza — calls toString() automatically
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        // Use getters to read specific details
        System.out.println("\nThe first pizza is: " + p1.getName());
        System.out.println("Its price is: $" + p1.getPrice());
        System.out.println ("The pizza size is "+ p3.getSize());
        
    }
    
}
