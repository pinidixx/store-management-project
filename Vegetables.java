/* 
   * Creates a Vegetables subclass that extends 
   * from Superclass Groceries
   */
    public class Vegetables extends Groceries {
    private boolean isOrganic;
    private boolean isLocal;

  /* 
   * No argument constructor 
   *
   */
     public Vegetables() {
     super();
    isOrganic = true;
    isLocal = true;
  }
        
  /* 
   * Parameterized Constructor 
   *
   */
    public Vegetables(String name, double price, int quantity, boolean isOrganic, boolean isLocal) {
      super(name, price, quantity);
        this.isOrganic = isOrganic;
        this.isLocal = isLocal;
    }

   /* 
   * Accessor Methods
   *
   */ 
     public boolean getisOrganic() {
      return isOrganic;
    }

    public boolean getisLocal() {
      return isLocal;
    }


   /* 
   * Mutator Methods
   *
   */
    public void setisOrganic (boolean isOrganic) {
      this.isOrganic = isOrganic;
    }

    public void setisLocal (boolean isLocal) {
      this.isLocal = isLocal;
    }


  /* 
   * toString Methods
   *
   */
    public String toString() {
      return super.toString() + "\nIs Organic? " + this.isOrganic + " \nIs Local? " + this.isLocal;
    }

      
  
    
  }