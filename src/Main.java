import java.util.*;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            dogs.add(Dog.getRandomDog());
        }

        for (int i = 0; i < 365; i++) {
            int randomIndex = random.nextInt(dogs.size());
            Dog tempDog = dogs.get(randomIndex);
            tempDog.randomAction();

            if (i % 30 == 0) {
                dogs.add(Dog.getRandomDog());
                System.out.println("New dog added");
            }
        }
        System.out.println(dogs.size());

        Map<String, Integer> animals = new HashMap<>();
        for (Dog dog : dogs) {
            String className = dog.getClass().getSimpleName();
            if (animals.containsKey(className)) {
                int countName = animals.get(className);
                animals.put(className, countName + 1);
            } else {
                animals.put(className, 1);
            }
        }

        for (String className : animals.keySet()) {
            int count = animals.get(className);
            System.out.println(className + " : " + count);
        }
    }
}
