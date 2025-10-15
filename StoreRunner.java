import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

//using Groceries class to identify details of the Groceries or overriding them
 
Groceries number1 = new Groceries();

Groceries number2 = new Groceries("Eggs", 5.48, 24);


Groceries number3 = new Groceries("Butter", 12.86, 10);

//using Vegetables class to identify details of the Vegetables or overriding them

Vegetables letterA= new Vegetables();


Vegetables letterB= new Vegetables("Eggplant", 2.47, 10, true, true);


Vegetables letterC= new Vegetables("Tomato", 3.20, 20, true, false);
   
 //using Fruits class to identify details of the Fruits or overriding them

Fruits standard= new Fruits();

   
Fruits standardA= new Fruits("Apple", 5.00, 15, true, 1 );


Fruits standardB= new Fruits("Mango", 6.00, 15, true, 2 );

//printing out the details of each item/accessory
System.out.println("What are the available groceries?");  
System.out.println(number1);
System.out.println(number2);
System.out.println(number3);
System.out.println(letterA);
System.out.println(letterB);
System.out.println(standard);
System.out.println(standardA);
System.out.println(standardB);




    
  } 
}

   