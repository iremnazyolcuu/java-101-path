package OOP;

public class CarConstructorMethod {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    CarConstructorMethod(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }

    CarConstructorMethod(){
        System.out.println("\nAn empty constructor method has been created!");
    }

    void increaseSpeed(int increment) {
        this.speed += increment;
    }

    int decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println(this.model + "'s speed is: " + this.speed);
    }

    void printInfo() {
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);
    }

    public static void main(String[] args) {

        CarConstructorMethod audi = new CarConstructorMethod("Audi A8", 10, "Blue");
        audi.printInfo();

        CarConstructorMethod bmw = new CarConstructorMethod();

    }
}
