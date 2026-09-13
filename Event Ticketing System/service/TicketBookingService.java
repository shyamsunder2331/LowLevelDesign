class TicketBookingService{
    public boolean bookTicket(String eventId,String seatNo,String mail,double amount,SeatValidator validator,
    PaymentProcessor processor,QRGenerator generator,NotificationService notifier){
        if(!validator.isAvailable(eventId,seatNo)){
            System.out.println("Seat is not available,Please choose another seat");
            return false;
        }
        if(!processor.processPayment(mail,amount)){
            System.out.println("Payment not processed");
            return false;
        }
        String qr=generator.generateQR(eventId,seatNo);
        notifier.sendNotification(mail,qr);
        return true;
    }
}