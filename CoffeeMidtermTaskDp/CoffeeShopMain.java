import java.util.Scanner;
public class CoffeeShopMain{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("choose coffee: ");
        String cof=scan.nextLine();
        Coffee coffee=CoffeeFactory.createCoffee(cof);

        while (true){
            System.out.println("wanna add toppings? (milk, caramel syrup, whippedcream, chocolate syrup, no): ");
            String topping = scan.nextLine().toLowerCase();
            if (topping.equals("no"))
                 break;
            if (topping.equals("m")){
                coffee= new MilkDecorator(coffee);
            }   else if(topping.equals("c")){
                coffee=new CaramelDecorator(coffee);
            } else if(topping.equals("w")){
                coffee= new WhippedCreamDecorator(coffee);
            } else if(topping.equals("cs")){
                coffee= new ChocolateDecorator(coffee);
            }  else{
                System.out.println("there is no such topping!");
            }
        }
        System.out.println("your order: " + coffee.getDescription());
        System.out.println("total: "+ coffee.getCost()+'$');
    }
}
