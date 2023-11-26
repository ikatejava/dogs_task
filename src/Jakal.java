import java.util.Random;

public class Jakal extends Dog {
    @Override
    void sniffOut() {
        System.out.println("Jackal sniffs out carrion");
    }

    public void hunt() {
        System.out.println("Jackal hunts");
    }

    public void howl() {
        System.out.println("Jackal howls");
    }

    public void randomAction() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber) {
            case 0:
                sniffOut();
                break;
            case 1:
                hunt();
                break;
            case 2:
                howl();
                break;
        }
    }
}
