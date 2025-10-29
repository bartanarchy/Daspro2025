// import java.util.Scanner;

// public class NestedLoop24 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double[][] temps = new double[5][7];

//         for (int i = 0; i < temps.length; i++) {
//             System.out.println("City: " + i);
//             for (int j = 0; j < temps[0].length; j++) {
//                 System.out.print("Day " + (j + 1) + ": ");
//                 temps[i][j] = scanner.nextDouble();
//             }
//             System.out.println();
//         }

//         for (int i = 0; i < temps.length; i++) {
//             System.out.println("City: " + i);
//             for (int j = 0; j < temps[0].length; j++) {
//                 System.out.print(temps[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class NestedLoop24 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double[][] temps = new double[5][7];

//         for (int i = 0; i < temps.length; i++) {
//             System.out.println("City: " + i);
//             for (int j = 0; j < temps[0].length; j++) {
//                 System.out.print("Day " + (j + 1) + ": ");
//                 temps[i][j] = scanner.nextDouble();
//             }
//             System.out.println();
//         }

//         int cityIndex = 0;
//         for (double[] cityTemps : temps) {
//             System.out.println("City: " + cityIndex);
//             for (double temp : cityTemps) {
//                 System.out.print(temp + " ");
//             }
//             System.out.println();
//             cityIndex++;
//         }
//     }
// }

import java.util.Scanner;

public class NestedLoop24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }


        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double total = 0;

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                total += temps[i][j];
            }

            double average = total / temps[0].length; 
            System.out.println("\nAverage temperature for City " + i + ": " + average);
            System.out.println();
        }
    }
}
