import java.util.Scanner;

class Fruit {

    String fruitName;

    double pricePerKg;

    double quantity;




    public Fruit(String fruitName, double pricePerKg, double quantity) {

        this.fruitName = fruitName;

        this.pricePerKg = pricePerKg;

        this.quantity = quantity;

    }



   

    public double calculateTotalCost() {

        return pricePerKg * quantity;

    }



 

    public void displayDetails() {

        System.out.println("Fruit Name: " + fruitName);

        System.out.println("Price per Kg: " + pricePerKg);

        System.out.println("Quantity: " + quantity + " kg");

        System.out.println("Total Cost: " + calculateTotalCost());

        System.out.println("--------------------");

    }



  

    public void updatePrice(double newPrice) {

        this.pricePerKg = newPrice;

    }



    

    public void updateQuantity(double newQuantity) {

        this.quantity = newQuantity;

    }

}





public class fruits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



      

        System.out.println("Enter details for Fruit Purchase 1:");

        System.out.print("Fruit Name: ");

        String name1 = scanner.nextLine();

        System.out.print("Price per Kg: ");

        double price1 = scanner.nextDouble();

        System.out.print("Quantity (in kg): ");

        double quantity1 = scanner.nextDouble();

        scanner.nextLine(); // Consume newline



        Fruit fruit1 = new Fruit(name1, price1, quantity1);



       

        System.out.println("\nEnter details for Fruit Purchase 2:");

        System.out.print("Fruit Name: ");

        String name2 = scanner.nextLine();

        System.out.print("Price per Kg: ");

        double price2 = scanner.nextDouble();

        System.out.print("Quantity (in kg): ");

        double quantity2 = scanner.nextDouble();

        scanner.nextLine(); 



        Fruit fruit2 = new Fruit(name2, price2, quantity2);



 

        System.out.println("\n--- Fruit Purchase Details ---");

        System.out.println("\nDetails for Fruit 1:");

        fruit1.displayDetails();

        System.out.println("\nDetails for Fruit 2:");

        fruit2.displayDetails();




        System.out.println("\n--- Updating Fruit 1 Details ---");

        System.out.print("Enter new price for " + fruit1.fruitName + ": ");

        double newPrice = scanner.nextDouble();

        fruit1.updatePrice(newPrice);



        System.out.print("Enter new quantity for " + fruit1.fruitName + ": ");

        double newQuantity = scanner.nextDouble();

        fruit1.updateQuantity(newQuantity);



      

        System.out.println("\nUpdated Details for Fruit 1:");

        fruit1.displayDetails();



        scanner.close();

    }

}