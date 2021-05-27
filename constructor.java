public class constructor {
    int modelyear;
    String modelname;
    public constructor(int year, String name){
        modelyear= year;
        modelname = name;
    }
    public static void main(String[]args){
        constructor mycar= new constructor(1996, "mustang");
        System.out.println(mycar.modelyear + ""+ mycar.modelname);
    }
}
