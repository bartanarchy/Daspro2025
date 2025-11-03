import java.util.Scanner;

public class assignment3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                
                if (i == 1 || i == N || j == 1 || j == N)
                    System.out.print(N + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
