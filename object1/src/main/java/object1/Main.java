package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person person2 = new Person("Gabriel", 39, 167);
        System.out.print(person2.name + " ");
        System.out.print(person2.age + " ");
        System.out.println(person2.height);
    }
}
