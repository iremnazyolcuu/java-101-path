package OOP;

public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    int increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            speed += increment;
        }
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    public static void main(String[] args) {

        Car audi = new Car();
        audi.model = "Audi A8";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(5);
        System.out.println(audi.model + "'s speed is: " + audi.speed);

        Car bmw = new Car();
        bmw.model = "BMW X6";
        bmw.speed = 20;
        System.out.println(bmw.model + "'s speed is: " + bmw.speed);

        Car mercedes = new Car();
        mercedes.model = "Mercedes CLA";
        mercedes.speed = 30;
        System.out.println(mercedes.model + "'s speed is: " + mercedes.speed);
    }
}
