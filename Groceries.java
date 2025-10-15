 /* 
   * Creates a Grocery superclass
   * 
   */

   public class Groceries {
    private String name;
    private double price;
    private int quantity;

  /* 
   * No argument constructor 
   *
   */
  
    public Groceries() {
      this.name = "Unknown";
      this.price = 0.0;
      this.quantity = 0;
    }
      
  /* 
   * Parameterized Constructor 
   *
   */
    public Groceries(String name, double price, int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
    }
     
   /* 
   * Accessor Methods
   *
   */
      public String getName() {
      return name;
    }

    public double getPrice() {
      return price;
    }

    public int getQuantity() {
      return quantity;
    }

  /* 
   * Mutator Methods
   *
   */
    public void setName (String name) {
      this.name = name;
    }

    public void setPrice (double price) {
      this.price = price;
    }

    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }
      
  /* 
   * toString Methods
   *
   */
    public String toString() {
      return "Groceries Name:" + name + ", Price: $" + price + ", quantity:" + quantity;
    }
 }

   