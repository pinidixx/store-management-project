/* 
   * Creates a Fruits subclass that extends 
   * from Superclass Groceries
   */
    public class Fruits extends Groceries {
    private boolean isSweet;
    private int weight;

   /* 
   * No argument constructor 
   *
   */
     public Fruits() {
     super();
    isSweet = true;
    weight = 5;
  }
   /* 
   * Parameterized Constructor 
   *
   */
    public Fruits(String name, double price, int quantity, boolean isSweet, int weight) {
      super(name, price, quantity);
        this.isSweet = isSweet;
        this.weight = weight;
    }


  /* 
   * Accessor Methods
   *
   */ 
     public boolean getisSweet() {
      return isSweet;
    }

    public int getweight() {
      return weight;
    }


   /* 
   * Mutator Methods
   *
   */
    public void setisSweet (boolean isSweet) {
      this.isSweet = isSweet;
    }

    public void setWeight (boolean Weight) {
      this.weight = weight;
    }


  /* 
   * toString Methods
   *
   */
    public String toString() {
      return super.toString() + "\nIs Sweet? " + this.isSweet + " \nWeight: " + this.weight;
    }

      
}    
