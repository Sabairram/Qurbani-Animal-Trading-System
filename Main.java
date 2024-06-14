import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();

        // Adding initial animals to the market
        market.addAnimal(new Cow(1, 400, 5, 1500, true));
        market.addAnimal(new Goat(2, 60, 3, 300, true));
        market.addAnimal(new Sheep(3, 70, 4, 350, true));
        market.addAnimal(new Camel(4, 500, 6, 2000, true));
		
		market.addAnimal(new Cow(5, 380, 4, 1400, true));
        market.addAnimal(new Cow(6, 420, 6, 1600, true));
        market.addAnimal(new Goat(7, 55, 2, 250, true));
        market.addAnimal(new Goat(8, 70, 4, 320, true));
        market.addAnimal(new Sheep(9, 75, 3, 300, true));
        market.addAnimal(new Sheep(10, 80, 5, 400, true));
        market.addAnimal(new Camel(11, 480, 7, 2200, true));
        market.addAnimal(new Camel(12, 520, 5, 2500, true));
        market.addAnimal(new Cow(13, 410, 5, 1550, true));
        market.addAnimal(new Goat(14, 58, 3, 280, true));
        market.addAnimal(new Sheep(15, 65, 2, 320, true));
        market.addAnimal(new Camel(16, 490, 6, 2100, true));
        market.addAnimal(new Cow(17, 390, 4, 1450, true));
        market.addAnimal(new Goat(18, 62, 4, 300, true));
        market.addAnimal(new Sheep(19, 72, 3, 380, true));

        User user = createUser(scanner); // Create user at the beginning

        boolean isFirstTime = true; // Flag to indicate if it's the first iteration

        while (true) {
            if (!isFirstTime) {
                System.out.println("1. List Animals");
                System.out.println("2. Buy Animal");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline after reading int

                switch (choice) {
                    case 1:
                        System.out.println("Animals in the Market:");
                        for (Animal animal : market.getAnimals()) {
                            animal.displayAnimalDetails();
                            System.out.println("Eligible for Qurbani: " + animal.isEligibleForQurbani());
                        }
                        break;
                    case 2:
                        System.out.print("Enter Animal ID to buy: ");
                        int animalId = scanner.nextInt();
                        user.buyAnimal(market, animalId);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
            isFirstTime = false;
        }
    }

    private static User createUser(Scanner scanner) {
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your initial balance: ");
        double userBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline after reading double

        return new User(userName, userBalance);
    }
}
