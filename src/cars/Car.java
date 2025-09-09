package cars;

public class Car {
    public static final String BRAND = "Toyota"; // constante, común a todos
    public static String model; // compartido, pero modificable
    public final int horsePower; // propio de cada coche, fijo

    public Car(int horsePower) {
        this.horsePower = horsePower;
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}
