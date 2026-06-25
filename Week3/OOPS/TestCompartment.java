package Week3.OOPS;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int randomNum = random.nextInt(4) + 1;
            
            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        System.out.println("====== Checking polymorphic behavior of notice() ======");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + " (Type: " + compartments[i].getClass().getSimpleName() + "):");
            System.out.println("  " + compartments[i].notice());
            System.out.println();
        }
    }
}
