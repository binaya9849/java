public class javaifelse {
    public static void main(String[]args) {
        int x = 20;
        int y = 20;
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("x and y are both equal");
        }
    //short hand for else if
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
