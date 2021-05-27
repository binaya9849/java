public class finalnonacessmodifier {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class final1 extends finalnonacessmodifier {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        final1 myFastCar = new final1();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
