package cars;

public class Main {
    public static void main(String[] args) {

        System.out.println("Brand: " + Car.BRAND);

        Car.model = "Corolla";
        System.out.println("Model: " + Car.model);

        Car car = new Car(110);
        System.out.println("Horse Power: " + car.horsePower);

        Car.brake();

        car.accelerate();
    }
}
