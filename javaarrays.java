public class javaarrays {
    public static void main(String[]args){
        //acess element of arrays
        String[] cars ={"volvo", "ferrari" , "BMW", "Ford"};
        System.out.println(cars[1]);
        System.out.println("finish");
        //change array element
        cars[1] = "Opel";
        System.out.println(cars[1]);
        System.out.println("finish");
        //array length
        System.out.println(cars.length);
        System.out.println("finish");
        //loop through array
        for (int i = 0; i< cars.length ; i++){
            System.out.println(cars[i]);
        }
        System.out.println("finish");
        //loop through array with for each
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("finish");
        //multidimeansional arrays
        int [][] myNumbers= { { 1,2,3,4,5},{6,7,8,9}};
        int z = myNumbers [1][2];
        System.out.println(z);


    }
}
