import java.util.Arrays;
import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] athletes = new String[sports.length][5];

        System.out.println("__________ Input Athlete Names for Each Sport __________");

        for (int i = 0; i < sports.length; i++) {
            System.out.println("\nEnter 5 athletes for " + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
        }

        
        System.out.println("\n=== Athlete List (Ascending Order) ===");
        for (int i = 0; i < sports.length; i++) {
            Arrays.sort(athletes[i]); 
            System.out.println("\n" + sports[i] + ":");
            for (String name : athletes[i]) {
                System.out.println(" - " + name);
            }
        }
    }
}
