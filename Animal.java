public abstract class Animal {
    private int id;
    private String type;
    private double weight;
    private int age;
    private double price;
    private boolean isHealthy;

    public Animal(int id, String type, double weight, int age, double price, boolean isHealthy) {
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.age = age;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    //Overriden method
    public abstract boolean isEligibleForQurbani();

    public void displayAnimalDetails() {
        System.out.println("ID: " + id + ", Type: " + type + ", Weight: " + weight + "kg"); 
		System.out.println("Age: " + age + " years, Price: $" + price + ", Healthy: " + isHealthy);
		System.out.println("              ");
    }
}
