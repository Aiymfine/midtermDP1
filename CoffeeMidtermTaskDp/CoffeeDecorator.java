abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    public double getCost(){
        return coffee.getCost();
    }
    public String getDescription(){
        return coffee.getDescription();
    }
} 

class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02;
    }
    public String getDescription(){
        return super.getDescription()+" with added milk";
    }
}


class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02;
    }
    public String getDescription(){
        return super.getDescription()+" with added caramel syrup";
    }
}

class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02;
    }
    public String getDescription(){
        return super.getDescription()+" with added whipped cream";
    }
}


class ChocolateDecorator extends CoffeeDecorator{
    public ChocolateDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2.02;
    }
    public String getDescription(){
        return super.getDescription()+" with added chocolate syrup";
    }
}

