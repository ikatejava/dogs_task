import java.util.Random;

public abstract class Dog {
    abstract void sniffOut();

    private static Random random = new Random();

    abstract void randomAction();

    public static Dog getRandomDog() {
        Dog tempDog = null;
        int randomNumber = random.nextInt(3);
        tempDog = switch (randomNumber) {
            case 0 -> new Wolf();
            case 1 -> new Jakal();
            case 2 -> new Coyote();
            default -> tempDog;
        };
        return tempDog;
    }
}
