abstract class Animal {
    // Instance variables || fields
    String name;
    String creatureType = "Animal";
    int legs;
    int hands;
    int eyes;
    int height;
    boolean hasTail;

    Animal(String name) {
        this.name = name;
    }

    // methods || actions
    void create() {
        String name = this.creatureType;
        if (this.name != "") {
            name = this.name;
        }
        
        System.out.println(name + " is created.");
    }

    void eat() {
        String name = this.creatureType;
        if (this.name != "") {
            name = this.name;
        }
        
        System.out.println(name + " is eating.");
    }

    void drink() {
        String name = this.creatureType;
        if (this.name != "") {
            name = this.name;
        }
        System.out.println(name + " is drinking.");
    }

    void speak() {
        System.out.println(this.creatureType + " is speaking.");
    }

    void run() {
        if (this.legs <= 0) return;
        System.out.println(this.creatureType + " is running with its " + this.legs + " legs.");
    }

    void attack() {
        System.out.println(this.creatureType + " is attacking.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        this.creatureType = "Dog";
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
        this.creatureType = "Cat";
    }
}

class Human extends Animal {
    Human(String name) {
        super(name);
        this.creatureType = "Human";
    }
}

class BasicJavaObject {
    // Run the code
    public static void main(String args[]) {
        // animal is an object
        // Animal animal = new Animal();

        // // legs is one of the animal state or data.
        // animal.legs = 3;
        // animal.run();

        // // eat is a one of animal behaviour
        // animal.eat();

        // BasicJavaObject.dog();
        // BasicJavaObject.cat();
        // BasicJavaObject.human();

        Animal dog = BasicJavaObject.animal2(new Dog("Mani"));
        BasicJavaObject.animal(new Dog("Kani"));
        BasicJavaObject.animal(new Dog("Tiger"));
        BasicJavaObject.animal(new Dog("German shepherd"));
        BasicJavaObject.animal(new Dog("Pitpull"));

        BasicJavaObject.animal(new Cat(""));
        BasicJavaObject.animal(new Human("Anand"));

    }

    private static void animal(Animal obj) {
        obj.create();
        // obj.eat();
        // obj.drink();
    }

    private static Animal animal2(Animal obj) {
        obj.create();
        // obj.drink();
        return obj;
    }

    private static void dog() {
        // Dog dog = new Dog();
        Animal dog = new Dog("");
        dog.eat();
        dog.drink();
    }

    private static void cat() {
        Animal cat = new Cat("");
        cat.eat();
        cat.drink();
    }

    private static void human() {
        Animal human = new Human("");
        human.eat();
        human.drink();
    }
}

// In class, fields, methods
// In object, state, behaviour
