class PaymentFactory{
    public static PaymentMethod createPayment(String type){
        switch(type.toLowerCase()){
            case "cc": 
            return new CreditCardPayment();
            case "pp":
            return new PayPalPayment();
            case "cr":
            return new CryptoPayment();
            default: throw new IllegalArgumentException("WRONG PAYMENT TYPE"); 
             //if input will not be these 3 types then it throws exception
        }
    }
}// here we use factory pattern to create payment methods,
// its also flexible and convinient especially if you deside to add new payment method