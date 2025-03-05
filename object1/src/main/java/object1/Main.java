package object1;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person person2 = new Person("Gabriel", 39, 167);
        System.out.print(person2.name + " ");
        System.out.print(person2.age + " ");
        System.out.println(person2.height);
        Car vehicle = new Car("Toyota", "Supra", 1997, 69657);
        System.out.println((vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel() + " " + vehicle.getMileage()));

        Chair features = new Chair("Cotton", "Green", 8);
        System.out.println(features.getColor() + " " + features.getMaterial() + " chair with " + features.getLegs() + " legs.");
    }
}
