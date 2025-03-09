package object1;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0; //Units are "centimeters".

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30, 175);
        Person person2 = new Person("Gabriel", 39, 167);

        /* Now you can use the Object `person1` */
        System.out.println("Name is: " + person1.name + ". He is " + person1.age + " years old. He is " + person1.height + "cm tall.");
        System.out.println("Name is: " + person2.name + ". He is " + person2.age + " years old. He is " + person2.height + "cm tall.");

    }
}
