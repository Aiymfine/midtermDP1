import java.util.Scanner;
class PaymentMain{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);        //we use input of user
        System.out.println("your payment method (cc, pp, cr): ");       //you must write one of the 3 methods in shorten form
        String method= scan.nextLine();
        PaymentMethod paymentMethod;

        if(method.equals("cc")){
            System.out.println("type here card number: ");      // it asks for credit card number if only you choose cc
            String cardNum=scan.nextLine();
            paymentMethod=new CreditCardPAdapter(cardNum);
        }
        else{
            paymentMethod= PaymentFactory.createPayment(method);    //use factory pattern to create other methods if u wanna add more
        }
        System.out.println("type here amount of money: ");
        double amount= scan.nextDouble();


        Transaction transaction= new Transaction(amount);
        try{
            paymentMethod.processPayment(amount);
            transaction.complete();     //if everything works correct it shows this status

        } 
        catch(Exception e){
            transaction.fail();     //if there is a problem, catch will show this status
        }
        System.out.println("transaction status is "+transaction.getStatus());
    }
}