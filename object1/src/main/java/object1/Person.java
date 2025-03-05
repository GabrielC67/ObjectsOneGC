package object1;

// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0; //Units are "centimeters".

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);

        /* Now you can use the Object `person1` */

    }
}
