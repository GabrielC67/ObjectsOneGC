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
        System.out.println("This person's name is " + person2.name + ". This perons is " + person2.age + " years old. He is " + person2.height + "cm tall!");
        Car car1 = new Car("Toyota", "Supra", 1997, 69657, "Black");
        Car car2 = new Car("Mazda", "Protege", 1999, 124325, "Emerald Mica");
        Car car3 = new Car("Acura", "Integra", 1998, 150000, "Phoenix Yellow");

        System.out.print(("This... Is a " + car1.getYear() + " " + car1.getMake() + " " + car1.getModel() + " with " + car1.getMileage() + " miles! It is "));
        System.out.println(car1.getColor() + " and is so rare! In fact, it is selling for over $100,000 \nwith low mileage examples!!");

        System.out.print("\nThis... Is a " + car2.getYear() + " " + car2.getMake() + " " + car2.getModel() + " with " + car2.getMileage() + " miles! This ");
        System.out.println(car2.getModel() + " is actually a car I used to drive!\nIn fact, mine was what they car " + car2.getColor() + " and while the color slow as molasses LOL.");

        System.out.print(("\nNow THIS... Is my dream car! It is a " + car3.getYear() + " " + car3.getMake() + " " + car3.getModel() + " with only " + car3.getMileage()));
        System.out.print(". The car is the ever so rare " + car3.getColor() + "\nand is arguably even more rare than the " + car1.getYear() + " " + car1.getMake() + " ");
        System.out.println(car1.getModel() + ".");
        Chair chair1 = new Chair("Cotton", "Green", 8);
        System.out.println("\nThis is the color of the chair: " + chair1.getColor() + ". The material used is:  " + chair1.getMaterial() + ". The chair has " + chair1.getLegs() + " legs.");



        Dog type = new Dog("Cocker Spaniel", 3, "Sporting Dog");
        System.out.println("This " + type.getName()  + ", is a " + type.getBreed() + " that is " + type.getAge() + " years old!");





    }
}
