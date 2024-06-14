public class Sheep extends Animal {
    public Sheep(int id, double weight, int age, double price, boolean isHealthy) {
        super(id, "Sheep", weight, age, price, isHealthy);
    }

    @Override
	//Overriding method
    public boolean isEligibleForQurbani() {
        return isHealthy() && getAge() >= 1;
    }
}
