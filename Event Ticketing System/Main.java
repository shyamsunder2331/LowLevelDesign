import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        TicketBookingService ticketService=new TicketBookingService();

        SeatValidator validator=new SeatValidator();
        PaymentProcessor processor=new PaymentProcessor();
        QRGenerator generator=new QRGenerator();
        NotificationService notifier=new NotificationService();

        boolean isBooked=ticketService.bookTicket("ShyamsConcert","A1","shyamsunder2331@gmail.com",99.78f,validator,processor,generator,notifier);
        if(isBooked) System.out.println("Your ticket is confirmed and shared through mail");
        else System.out.println("your ticket is not confirmed, retry  booking after sometime.");
    }
}