public class Cow extends Animal {
    public Cow(int id, double weight, int age, double price, boolean isHealthy) {
        super(id, "Cow", weight, age, price, isHealthy);
    }

    @Override
	//Overriding method
    public boolean isEligibleForQurbani() {
        return isHealthy() && getAge() >= 2;
    }
}
