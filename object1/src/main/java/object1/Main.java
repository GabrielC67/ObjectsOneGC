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
        Car vehicle1 = new Car("Toyota", "Supra", 1997, 69657);
        Car vehicle2 = new Car("Mazda", "Protege", 1999, 124325);
        Car vehicle3 = new Car("Acura", "Integra", 1998, 150000);

        System.out.println((vehicle1.getYear() + " " + vehicle1.getMake() + " " + vehicle1.getModel() + " " + vehicle1.getMileage()));

        Chair features = new Chair("Cotton", "Green", 8);
        System.out.println(features.getColor() + " " + features.getMaterial() + " chair with " + features.getLegs() + " legs.");

        Dog type = new Dog("Cocker Spaniel", 3, "Sporting Dog");
        System.out.println("This " + type.getName()  + ", is a " + type.getBreed() + " that is " + type.getAge() + " years old!");

        System.out.println(vehicle2.getYear() + " " + vehicle2.getMake() + " "  + vehicle2.getModel() + " with " + vehicle2.getMileage());
    }
}
