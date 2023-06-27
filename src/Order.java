import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Order {

  public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {

    System.out.println("\nHello customer. Would you like to place an order? (Y or N):");
    Scanner input = new Scanner(System.in);
    String placeOrder = input.nextLine();

    ArrayList<Object> order = new ArrayList<>();

    if (placeOrder.equalsIgnoreCase("y")) {
      order.add(LocalDate.now());
      order.add(LocalTime.now());
      
      System.out.println("\nHere is the menu:");
      System.out.println("CUPCAKES:");
      
      int itemNumber = 0;

      for (int i = 0; i < cupcakeMenu.size(); i++) {
        
        itemNumber++;
        System.out.print(itemNumber + ". ");

        cupcakeMenu.get(i).type();
        
        System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
        System.out.println();

      }

      System.out.println("DRINKS:\n");
      for (int i = 0; i < drinkMenu.size(); i++) {
        
        itemNumber++;
        System.out.print(itemNumber + ". ");
        drinkMenu.get(i).type();
        System.out.println("Price: $" + drinkMenu.get(i).getPrice());
        System.out.println();

      }

    } else {
      System.out.println("Have a nice day then.");
    }
  }

}