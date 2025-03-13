class CoffeeFactory{
    public static Coffee createCoffee(String coffies){
        if (coffies.equals("e")) {
            return new Espresso();
        } else if (coffies.equals("c")) {
            return new Cappuccino();
        } else if (coffies.equals("l")) {
            return new Latte();
        } else if (coffies.equals("a")) {
            return new Americano();
        } else {
            throw new IllegalArgumentException("Such coffee doesnt exist!");
        }
    }
}