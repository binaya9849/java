public class forloop {
    public static void main(String[]args){
        //for loop
        for (int i = 0; i <= 10; i = i + 2) {
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        //for each loop
        String[] cars ={"volvo", "ferrari" , "BMW", "Ford"};
        for(String i : cars){
            System.out.println(i);
        }
        //continue ko
        for (int a = 0; a < 10; a++) {
            if (a == 4) {
                continue;
            }
            System.out.println(a);
        }


    }
}
