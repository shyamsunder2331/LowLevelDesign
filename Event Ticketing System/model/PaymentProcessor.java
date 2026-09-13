class PaymentProcessor{
    public boolean processPayment(String mail,double amount){
        System.out.println("Charging amount "+amount+" to "+mail);
        return true;
    }
}