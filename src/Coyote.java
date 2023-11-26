import java.util.Random;

public class Coyote extends Dog {
    @Override
    void sniffOut() {
        System.out.println("Coyote sniffs out hairs");
    }

    public void sleep() {
        System.out.println("Coyote sleeps");
    }

    public void swim() {
        System.out.println("Coyote swims");
    }

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                sniffOut();
                break;
            case 1:
                sleep();
                break;
            case 2:
                swim();
                break;
        }
    }
}
