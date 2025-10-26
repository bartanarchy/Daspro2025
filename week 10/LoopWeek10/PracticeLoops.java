// public class PracticeLoops {
//     public static void main(String[] args) {
//         for (int i = 5; i <= 50; i += 5) {
//             System.out.print(i + " ");
//         }
//     }
// }


// public class PracticeLoops {
//     public static void main(String[] args) {
//         for (int i = 10; i >= 1; i--) {
//             System.out.print(i + " ");
//         }
//     }
// }



// public class PracticeLoops {
//     public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//         System.out.print((i * i) + " ");
//        }
//     }
// }

import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        long result = 1;
        String steps = "";

        for (int i = n; i >= 1; i--) {
            result *= i;
            steps += (i == 1) ? i : i + " x ";
        }

        System.out.println("\nCalculating " + n + "! ...");
        System.out.println(steps + " = " + result);
        System.out.println("So, the factorial of " + n + " is " + result);
    }
}