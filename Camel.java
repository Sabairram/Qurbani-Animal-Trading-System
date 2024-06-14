public class Camel extends Animal {
    public Camel(int id, double weight, int age, double price, boolean isHealthy) {
        super(id, "Camel", weight, age, price, isHealthy);
    }

    @Override
    public boolean isEligibleForQurbani() {
        return isHealthy() && getAge() >= 5;
    }
}
