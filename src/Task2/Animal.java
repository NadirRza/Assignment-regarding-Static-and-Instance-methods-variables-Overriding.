package Task2;

public class Animal {
    static void speak() {
        System.out.println("Animal speaks");
    }


    static class Dog extends Animal {
        static void speak() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
      Animal animal = new Animal();
      animal.speak();
      Dog dog = new Dog();
      dog.speak();
      Animal dogAsAnimal = new Dog();
      dogAsAnimal.speak();

      Animal.speak();
      Dog.speak();
    }
}

