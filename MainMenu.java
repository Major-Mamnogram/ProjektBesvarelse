package byggemarket.tui;
import java.util.Scanner;
import byggemarket.controller.*;
import byggemarket.model.*;

/**
 * Write a description of class MainMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class MainMenu {
    // instance variables
    private OrderController orderController;
    private Order currentOrder;
   
    

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        orderController = new OrderController();
        
       
    }
    
    public void start() {
        mainMenu();
    }
    
    private void mainMenu() {
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                 setCustomer();
                  break;
                case 2:
                  createOrder();
                  break;
                case 3:
                  createOrderLine();
                  break; 
                case 4:
                checkDelivery();
                  break;
                case 5:
               endOrder();
               case 6:
                   adminAddProduct();  
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
                default:
                  System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                  break;
            }
        }
    }

    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        
        System.out.println(" (1) opret kunde");
        System.out.println(" (2) opret ordre");
        System.out.println(" (3) tilføj produkt til ordre");
        System.out.println(" (4) tjek aflevering");
        System.out.println(" (5) afslut ordre");
        System.out.println(" (6) admin tilføj produkt");
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Vælg:");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    //opret kunde
     private void setCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast navn");
        String name = input.nextLine();
        System.out.println("Indtast telefon nummer");
        int phone = input.nextInt();
        orderController.setCustomer(name, phone);
        
    }
    
    //opret ordre
    private void createOrder(){
        Order order = orderController.createOrder();
        System.out.println("Ordre oprettet med ID: " + order.getOrderID());
    } 
    
    //opret ordrelinje
    private void createOrderLine(){
        Scanner input = new Scanner(System.in);
        System.out.println("angiv produkt nummer");
        int productNO = input.nextInt();
        System.out.println("angiv antal");
        int qty = input.nextInt();
        OrderLine orderLine = orderController.addOrderLine(productNO, qty);
        if(orderLine == null){
            System.out.println("Uventet fejl, start forfra");
        }else{
            System.out.println("Produkt tilføjet succesfuldt " + orderLine.getProduct().getProductNO()); 
        }
    }
    
    //tilføj produkt
    //ToDo undersøg om scanner skal tilføjes seperat
    private void adminAddProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("angiv produkt nummer til nyt produkt");
        int productNO = input.nextInt();
        //orderController.adminAddProduct(productNO);
    }
    
    //check delivery status
    private void checkDelivery(){
    Scanner input = new Scanner(System.in);

    System.out.println("Angiv ordre ID:");
    int orderID = input.nextInt();

    //Order order = orderController.getOrderID(orderID);
    //if (order == null) {
      //  System.out.println("Ordre ikke fundet.");
        //return;
    //}

    //System.out.println("Er produktet leveret for " + orderID() + "?");
    //boolean delivered = input.nextBoolean();
    //order.setDelivered(delivered);

    //if (order.getOrderStatus()) {
        System.out.println("Produktet er afleveret.");
    //} else {
        System.out.println("Produktet er ikke afleveret.");
    //}
}
  
private void endOrder(){
    Scanner input = new Scanner(System.in);

    System.out.println("Angiv ordre ID:");
    int orderID = input.nextInt();
    
    System.out.println("ordrestatus for " + orderID);
    boolean delivered = input.nextBoolean();
    
    
    //if (Order.orderEnded) {
        System.out.println("Ordren er afsluttet");
    //} else {
        System.out.println("Ordren er ikke afsluttet.");
   // }
        
    }
    }
