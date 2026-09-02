class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class string {
    public static void main(String[] args) {

        Dog d1 = new Dog("Tommy", "Labrador");
        Dog d2 = new Dog("Bruno", "German Shepherd");

        d1.setName("Rocky");
        d1.setBreed("Bulldog");

        d2.setName("Max");
        d2.setBreed("Poodle");

        d1.display();
        d2.display();
    }
}