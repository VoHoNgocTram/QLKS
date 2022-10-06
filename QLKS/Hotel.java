package QLKS;
import java.util.Scanner;

public class Hotel {
    private int guest_Stay;
    private String type_Of_Room;
    private double price_Of_Room;
    private Customer customer;

    public Hotel(int guest_Stay, String type_Of_Room, double price_Of_Room, Customer customer) {
        this.guest_Stay = guest_Stay;
        this.type_Of_Room = type_Of_Room;
        this.price_Of_Room = price_Of_Room;
        this.customer = customer;
    }
    
    public Hotel(){
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void putInfManaged()
    {
        Scanner in= new Scanner(System.in);
        customer=new Customer();
        customer.putInfCustomer();
        System.out.print("- The information of booking");
        System.out.print("\n The number of days guest stays: ");
        guest_Stay=in.nextInt();
        System.out.print("\n Type of room: ");
        type_Of_Room=in.nextLine();
        System.out.print("\n Price of room:");
        price_Of_Room=in.nextDouble();
        in.close();
    }

    public void showInfManaged()
    {
        System.out.print("The information of booking");
        System.out.print("\n The number of days guest stays: "+guest_Stay);
        System.out.print("\n Type of room: "+type_Of_Room);
        System.out.print("\n Price of room:"+price_Of_Room);
    }

    public double totalPrice()
    {
        return guest_Stay * price_Of_Room;
    }
 }

