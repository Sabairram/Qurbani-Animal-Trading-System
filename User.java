public class User {
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean buyAnimal(Market market, int animalId) {
        Animal animal = market.findAnimalById(animalId);
        if (animal != null && animal.getPrice() <= balance) {
            balance -= animal.getPrice();
            market.removeAnimal(animal);
            System.out.println(name + " bought a " + animal.getType());
            return true;
        } else {
            System.out.println("Purchase failed.");
            return false;
        }
    }
}
