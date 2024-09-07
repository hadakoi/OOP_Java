// Main Animal class
class Animal {
    public String name; // Name of the animal
    public int age; // Age of the animal

    // Constructor to initialize Animal
    public Animal(String name, int age) {
        this.name = name; // Set the animal's name
        this.age = age; // Set the animal's age
    }

    // Method to get the name of the animal
    public String getName() {
        return name; // Return the name of the animal
    }

    // Method to get the age of the animal
    public int getAge() {
        return age; // Return the age of the animal
    }

    // Method for animal speech with a default implementation
    public void animalSpeak() {
        System.out.println("Animal not defined"); // Default message if animal's speech is not defined
    }
}

// Dog class that extends Animal
class Dog extends Animal {
    private String breed; // New field specific to Dog

    // Constructor to initialize Dog
    public Dog(String name, int age, String breed) {
        super(name, age); // Calls the constructor of Animal to initialize name and age
        this.breed = breed; // Initialize the breed of the Dog
    }

    // Method to get the breed of the Dog
    public String getBreed() {
        return breed; // Return the breed of the Dog
    }

    // Overriding animalSpeak method for Dog
    @Override
    public void animalSpeak() {
        // Calls the getName() method from Animal and prints a Dog-specific message
        System.out.println(getName() + " says: Woof!");
    }
}

// Cat class that extends Animal
class Cat extends Animal {
    private String breed; // New field specific to Cat

    // Constructor to initialize Cat
    public Cat(String name, int age, String breed) {
        super(name, age); // Calls the constructor of Animal to initialize name and age
        this.breed = breed; // Initialize the breed of the Cat
    }

    // Method to get the breed of the Cat
    public String getBreed() {
        return breed; // Return the breed of the Cat
    }

    // Overriding animalSpeak method for Cat
    @Override
    public void animalSpeak() {
        // Calls the getName() method from Animal and prints a Cat-specific message
        System.out.println(getName() + " says: Meow!");
    }
}

// Main class to display animals
public class Inheritance1 {
    public static void main(String[] args) {
        // Creating instances of Animal, Dog, and Cat
        Animal animal1 = new Animal("Generic Animal", 5); // Base Animal instance
        Dog animal2 = new Dog("Rover", 3, "Labrador"); // Dog instance with breed
        Cat animal3 = new Cat("Whiskers", 2, "Siamese"); // Cat instance with breed

        // Displaying information and animal speech for the base Animal instance
        System.out.println("Animal 1: " + animal1.getName() + ", Age: " + animal1.getAge());
        animal1.animalSpeak(); // Calls the default animalSpeak method from Animal

        // Displaying information and animal speech for the Dog instance
        // This line prints the name, age, and breed of the Dog instance, and then calls the Dog-specific animalSpeak method
        System.out.println("Animal 2: " + animal2.getName() + ", Age: " + animal2.getAge() + ", Breed: " + animal2.getBreed());
        animal2.animalSpeak(); // Calls the overridden animalSpeak method from Dog

        // Displaying information and animal speech for the Cat instance
        // This line prints the name, age, and breed of the Cat instance, and then calls the Cat-specific animalSpeak method
        System.out.println("Animal 3: " + animal3.getName() + ", Age: " + animal3.getAge() + ", Breed: " + animal3.getBreed());
        animal3.animalSpeak(); // Calls the overridden animalSpeak method from Cat
    }
}

/*
1. Polymorphism: By declaring Animal animal2 = new Dog("Rover", 3, "Labrador");, 
   you can take advantage of polymorphism. This allows you to handle objects of different subclasses (Dog, Cat) 
   through a common superclass reference (Animal). It enables you to write code that works with any Animal 
   subtype and only needs to know about the Animal interface, not the specifics of each subtype.

2. Flexibility: This approach is useful for creating collections or methods that operate on Animal 
   objects without needing to know their specific types. For example,
   you can have a list of Animal objects that includes different types of animals (Dog, Cat), 
   and you can iterate over them to call methods like animalSpeak(), relying on the overridden implementations in each subclass.

3. Encapsulation: Declaring Animal animal2 means you can write code that is more abstract and flexible. You can store a reference to any type of Animal and call methods defined in Animal, allowing for code that can work with any subclass of Animal without needing to know its exact type.

4. Limitations: When using Animal animal2, you cannot directly access Dog- or Cat-specific methods (e.g., getBreed()). 
   You can only access methods defined in Animal. To use subclass-specific methods, casting is required,
   but this should be done carefully to avoid ClassCastException.
*/