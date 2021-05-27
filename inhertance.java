class inhertance {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("tuut , tuuut!");
    }
}
class car extends inhertance{
    private String modelname= "mustang";
    public static void main(String[]args){
        // create a mycar object
        car mycar = new car();

        //call the honk() method(from the vehical class) on the mycar object
        mycar.honk();

        //Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(mycar.brand + " " + mycar.modelname);
    }
}
