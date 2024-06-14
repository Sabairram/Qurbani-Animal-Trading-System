public class Goat extends Animal {
    public Goat(int id, double weight, int age, double price, boolean isHealthy) {
        super(id, "Goat", weight, age, price, isHealthy);
    }

    @Override
	//Overriding method
    public boolean isEligibleForQurbani() {
        return isHealthy() && getAge() >= 1;
    }
}
