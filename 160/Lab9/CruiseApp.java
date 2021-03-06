/** application class for Customer.java
  * Lab 10 COMP160
  * Bayley Millar
  */
import java.util.Scanner;
import java.text.NumberFormat;
public class CruiseApp{
  
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    confirmBooking(customer1); 
    confirmBooking(customer2);
    confirmBooking(customer3);
    confirmBooking(customer4);
    confirmBooking(customer5);
    confirmBooking(customer6);
    confirmBooking(customer7);
    confirmBooking(customer8);
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8);
  }
  
  /** method will display booking details*/
  public static void confirmBooking(Customer customer){
    double ticketPrice = 56.0;
    double mealPrice = 30.0;
    NumberFormat n1 = NumberFormat.getCurrencyInstance();
    if (customer.isChild()){
      ticketPrice = (ticketPrice / 2.0);
      mealPrice = (mealPrice / 2.0);
    }else if (customer.isStudent()){
      ticketPrice = (ticketPrice / 2.0);
      mealPrice = (mealPrice * 0.9);
    }else {
      ticketPrice = (ticketPrice * 0.8);
      mealPrice = (mealPrice * 0.9);
    }
    
    System.out.println(customer.getName() + " \n" + " Ticket price: " + n1.format(ticketPrice) + "\n " + " Meal price: " + n1.format(mealPrice) + "\n " + "Total price: " + n1.format(ticketPrice + mealPrice)) ;
    Scanner scan = new Scanner(System.in);
    System.out.println("enter Y/N");
    String input = scan.nextLine();
    if (input.equals( "Y") || input.equals("y")){
      System.out.println("booked");
      customer.setBooked();
    }
  }
  
  /**will show the booking*/
  public static void showBooked(Customer customer){
    if (customer.isBooked() == true){
      System.out.println(customer.getName() + " is booked");
    }
    
  }
  
  
  
}