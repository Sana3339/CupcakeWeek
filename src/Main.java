import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main (String[] args) {

    ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
    Cupcake cupcake = new Cupcake();
    RedVelvet redVelvet = new RedVelvet();
    Chocolate chocolate = new Chocolate();

    System.out.println("\nWe are in the middle of creating the cupcake menu. " +
      "\nWe currently have three cupcakes on the menu but we need to decide on pricing.");

    Scanner input = new Scanner(System.in);
    System.out.println("\nWe are deciding on the price for our standard cupcake. " +
      "\nHere is the description: ");
      cupcake.type();

    System.out.println("\nHow much would you like to charge for the cupcake? " + 
      "(Input a numerical number taken to 2 decimal places):");
    
    String priceText = input.nextLine();
    double price = Double.parseDouble(priceText);
    cupcake.setPrice(price);
    cupcakeMenu.add(cupcake);


    System.out.println("\nWe are deciding on the price for our red velvet cupcake. " +
      "Here is the description: ");
      redVelvet.type();

    System.out.println("How much would you like to charge for the cupcake? " + 
      "(Input a numerical number taken to 2 decimal places):");
    
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    redVelvet.setPrice(price);
    cupcakeMenu.add(redVelvet);


    System.out.println("\nWe are deciding on the price for our chocolate cupcake. " +
      "Here is the description: ");
      chocolate.type();

    System.out.println("How much would you like to charge for the cupcake? " + 
      "(Input a numerical number taken to 2 decimal places):");
    
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    chocolate.setPrice(price);
    cupcakeMenu.add(chocolate);

    ArrayList<Drink> drinkMenu = new ArrayList<>();
    Drink water = new Drink();
    Soda soda = new Soda();
    Milk milk = new Milk();

    System.out.println("\nWe are deciding on the price for a bottle of water. " +
      "Here is the description: ");
      water.type();

    System.out.println("How much would you like to charge for the water? " + 
      "(Input a numerical number taken to 2 decimal places):");
    
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    water.setPrice(price);
    drinkMenu.add(water);

    System.out.println("\nWe are deciding on the price for a can of soda " +
      "Here is the description: ");
      soda.type();

    System.out.println("How much would you like to charge for the soda? " + 
      "(Input a numerical number taken to 2 decimal places):");
    
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    soda.setPrice(price);
    drinkMenu.add(soda);

    System.out.println("\nWe are deciding on the price for a carton of milk. " +
      "Here is the description: ");
      water.type();

    System.out.println("How much would you like to charge for the milk? " + 
      "(Input a numerical number taken to 2 decimal places):");
    
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    milk.setPrice(price);
    drinkMenu.add(milk);

    new Order(cupcakeMenu, drinkMenu);

  }
}

  class Cupcake {

    public double price;

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public void type() {
      System.out.println("A basic, generic cupcake, with vanilla frosting");
    }

  }

  class RedVelvet extends Cupcake {

    public void type() {
      System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }

  }

  class Chocolate extends Cupcake {

    public void type() {
      System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
  }

  class Drink {

    double price;

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public void type() {
      System.out.println("A bottle of water.");
    }

  }

  class Soda extends Drink {

    public void type() {
      System.out.println("A bottle of soda.");
    }
  }

  class Milk extends Drink {

    public void type() {
      System.out.println("A bottle of milk");
    }

  }
