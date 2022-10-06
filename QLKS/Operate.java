package QLKS;
import java.util.Scanner;

public class Operate{
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //int n;
       // System.out.println("Number of customer: ");
        //n=in.nextInt();
        Hotel hotel;
        hotel= new Hotel();
        System.out.println("Nhap thong tin khach hang la: ");
        hotel.putInfManaged();
        hotel.showInfManaged();
        
        in.close();
    }
}