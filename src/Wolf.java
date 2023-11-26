import java.util.Random;

public class Wolf extends Dog {
    @Override
    void sniffOut() {
        System.out.println("Wolf sniffs out foxes");
    }

    public void eat() {
        System.out.println("Wolf eats");
    }

    public void reproduce() {
        System.out.println("Wolf reproduces");
    }

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                sniffOut();
                break;
            case 1:
                eat();
                break;
            case 2:
                reproduce();
                break;
        }
    }
}
