interface Coffee{
    double getCost();
    String getDescription();
}

class Espresso implements Coffee{
    public double getCost(){
        return 1.11;
    }
    public String getDescription(){
        return "Espresso";
    }
}

class Cappuccino implements Coffee{
    public double getCost(){
        return 2.22;
    }
    public String getDescription(){
        return "Cappuccino";
    }
}

class Latte implements Coffee{
    public double getCost(){
        return 3.33;
    }
    public String getDescription(){
        return "Latte";
    }
}

class Americano implements Coffee{
    public double getCost(){
        return 4.44;
    }
    public String getDescription(){
        return "Americano";
    }
}