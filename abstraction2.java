
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class crow extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class abstraction2 {
    public static void main(String[] args) {
        crow myPig = new crow(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

