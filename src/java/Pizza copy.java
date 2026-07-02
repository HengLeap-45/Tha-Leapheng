public class Pizza {
    
    // -----------------------------------------------
    // STEP 1: Fields — the pizza's personal details
    // (private = locked inside, nobody can change them directly)
    // -----------------------------------------------
    private String name;    // example: "Margherita"
    private String size;    // example: "Large"
    private double price;   // example: 8.50
    
    // -----------------------------------------------
    // STEP 2: Constructor — runs when we CREATE a pizza
    // Like filling in an order form for the very first time
    // -----------------------------------------------
    public Pizza(String name, String size, double price) {
        this.name  = name;    // "this" pizza's name = the name we received
        this.size  = size;    // "this" pizza's size = the size we received
        this.price = price;   // "this" pizza's price = the price we received
    }
    
    // -----------------------------------------------
    // STEP 3: Getters — little windows to READ the details
    // Other classes can look but cannot change anything
    // -----------------------------------------------
    public String getName()  { return name;  }
    public String getSize()  { return size;  }
    public double getPrice() { return price; }
    
    // -----------------------------------------------
    // STEP 4: toString — how the pizza introduces itself
    // Java calls this automatically when we print the pizza
    // -----------------------------------------------
    @Override
    public String toString() {
        // %-15s = name in 15 spaces (left-aligned)
        // %-8s  = size in 8 spaces  (left-aligned)
        // $%.2f = price with 2 decimal places
        return String.format("%-15s %-8s $%.2f", name, size, price);
    }
}


