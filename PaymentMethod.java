interface PaymentMethod{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("credit card payment of "+amount+" is in process");
    }
}
class PayPalPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("paypal payment of "+amount+" is in ptocess");
    }
}

class CryptoPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("crypto payment of "+amount+" is in process");
    }
}
// all the paymont methods implements this interface

