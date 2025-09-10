package cars;

public class Car {
    private static final String BRAND = "Toyota";
    private static String model;
    private final int horsePower;

    public static String getBrand() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

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
