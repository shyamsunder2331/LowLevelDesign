class QRGenerator{
    public String generateQR(String eventId,String seatNo){
        String qrCode="QR-"+eventId+" "+seatNo;
        System.out.println("Generated QR " +qrCode);
        return qrCode;
    }
}