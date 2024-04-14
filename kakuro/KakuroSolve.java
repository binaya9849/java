import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KakuroSolve{
    
    private static int[][] puzzle;
    private static int height;
    private static int width;
    
    public static void main(String[] args) {
        // Read the input Kakuro puzzle from the file
        readInput("kakuroInput.txt");
        
        // Solve the Kakuro puzzle using backtracking
        solve();
        
        // Output the solution
        printSolution();
    }
    
    private static void readInput(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            height = scanner.nextInt();
            width = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            puzzle = new int[height][width];
            for (int i = 0; i < height; i++) {
                String[] row = scanner.nextLine().split(",");
                for (int j = 0; j < width; j++) {
                    if (!row[j].equals("X")) {
                        puzzle[i][j] = Integer.parseInt(row[j]);
                    } else {
                        puzzle[i][j] = -1; // Mark as non-filled cell
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private static void solve() {
        // Implement backtracking algorithm here
        // Start from the top-left corner and recursively try different combinations of digits
        // Use pruning techniques to optimize the search
    }
    
    private static void printSolution() {
        // Output the solved Kakuro puzzle
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (puzzle[i][j] == -1) {
                    System.out.print(" ");
                } else {
                    System.out.print(puzzle[i][j]);
                }
                if (j < width - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
