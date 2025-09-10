package cars;

public class Main {
    public static void main(String[] args) {

        System.out.println("Brand: " + Car.getBrand());

        Car.setModel("Corolla");
        System.out.println("Model: " + Car.getModel());

        Car car = new Car(110);
        System.out.println("Horse Power: " + car.getHorsePower());

        Car.brake();

        car.accelerate();
    }
}
