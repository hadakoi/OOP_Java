// Main Animal class
class Animal {
  public String name; // Name of the animal
  public int age; // Age of the animal
  private String breed; // New field for breed in Animal

  // Constructor to initialize Animal
  public Animal(String name, int age, String breed) {
    this.name = name; // Set the animal's name
    this.age = age; // Set the animal's age
    this.breed = breed; // Set the animal's breed
  }

  // Method to get the name of the animal
  public String getName() {
    return name; // Return the name of the animal
  }

  // Method to get the age of the animal
  public int getAge() {
    return age; // Return the age of the animal
  }

  // Method to get the breed of the animal (now returns the actual breed)
  public String getBreed() {
    return breed; // Return the breed of the animal
  }

  // Method for animal speech with a default implementation
  public void animalSpeak() {
    System.out.println("Animal not defined"); // Default message if animal's speech is not defined
  }
}

// Dog class that extends Animal
class Dog extends Animal {
  // Constructor to initialize Dog
  public Dog(String name, int age, String breed) {
    super(name, age, breed); // Calls the constructor of Animal to initialize name, age, and breed
  }

  // Overriding getBreed method for Dog
  @Override
  public String getBreed() {
    return "Dog breed: " + super.getBreed(); // Calls Animal's getBreed() to return the actual breed
  }

  // Overriding animalSpeak method for Dog
  @Override
  public void animalSpeak() {
    System.out.println(getName() + " says: Woof!"); // Calls the getName() method from Animal
  }
}

// Cat class that extends Animal
class Cat extends Animal {
  // Constructor to initialize Cat
  public Cat(String name, int age, String breed) {
    super(name, age, breed); // Calls the constructor of Animal to initialize name, age, and breed
  }

  // Overriding getBreed method for Cat
  @Override
  public String getBreed() {
    return "Cat breed: " + super.getBreed(); // Calls Animal's getBreed() to return the actual breed
  }

  // Overriding animalSpeak method for Cat
  @Override
  public void animalSpeak() {
    System.out.println(getName() + " says: Meow!"); // Calls the getName() method from Animal
  }
}

// Main class to display animals
public class Inheritance2 {
  public static void main(String[] args) {
    // Creating instances of Animal, Dog, and Cat
    Animal animal1 = new Animal("Generic Animal", 5, "Unknown"); // Base Animal instance
    Animal animal2 = new Dog("Rover", 3, "Labrador"); // Dog instance with breed
    Animal animal3 = new Cat("Whiskers", 2, "Siamese"); // Cat instance with breed

    // Displaying information and animal speech for the base Animal instance
    System.out.println("Animal 1: " + animal1.getName() + ", Age: " + animal1.getAge() + ", Breed: " + animal1.getBreed());
    animal1.animalSpeak(); // Calls the default animalSpeak method from Animal

    // Displaying information and animal speech for the Dog instance
    System.out.println("Animal 2: " + animal2.getName() + ", Age: " + animal2.getAge() + ", Breed: " + animal2.getBreed());
    animal2.animalSpeak(); // Calls the overridden animalSpeak method from Dog

    // Displaying information and animal speech for the Cat instance
    System.out.println("Animal 3: " + animal3.getName() + ", Age: " + animal3.getAge() + ", Breed: " + animal3.getBreed());
    animal3.animalSpeak(); // Calls the overridden animalSpeak method from Cat
  }
}


/*
1. Animal animal2 = new Dog("Rover", 3, "Labrador");:
Polymorphism: You can use the Animal reference to point to a Dog object.
This allows you to call overridden methods in Dog, such as animalSpeak(), and the overridden getBreed() method 
if it is defined in Dog or Cat.

2.Default and Overridden Methods:
getBreed(): The Animal class provides a default implementation that returns "No information".
The Dog and Cat classes override this method to provide specific information about their breeds.
When you call getBreed() on an Animal reference pointing to a Dog or Cat, the overridden method in the specific subclass is invoked.

3.Accessing Methods:
Since Dog and Cat override getBreed() and animalSpeak(), calling these methods on an Animal reference
that points to a Dog or Cat instance will use the overridden methods. This demonstrates polymorphism,
where the actual method that gets called is determined at runtime based on the object's actual type, not the reference type.

In summary, with this setup, you can use Animal as a reference type for objects of Dog or Cat
and you'll be able to call both the default and overridden methods appropriately.
*/