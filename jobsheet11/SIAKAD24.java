// import java.util.Scanner;
// public class SIAKAD24 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int[][] score = new int[4][3];

//         // for (int i = 0; i < score.length; i++){
//         //     System.out.println("Enter scores for student #" + (i + 1));
//         //     for (int j = 0; j < score[i].length; j++){
//         //         System.out.print("Course #" + (j + 1) + " Score: ");
//         //         score[i][j] = input.nextInt();
//         //     }
//         // }

//         double sumForEachStudent = 0;

//         for (int i = 0; i < score.length; i++) {
//             System.out.println("Enter scores for student #" + (i + 1));
//             sumForEachStudent = 0;

//             for (int j = 0; j < score[i].length; j++) {
//                 System.out.print("Course #" + (j + 1) + " Score: ");
//                 score[i][j] = input.nextInt();
//                 sumForEachStudent += score[i][j];
//             }

//             System.out.println("Average score: " + sumForEachStudent / 3);
//         }

//         for (int j = 0; j < 3; j++) {
//             sumForEachStudent = 0;
//             for (int i = 0; i < 4; i++) {
//                 sumForEachStudent += score[i][j];
//             }
//             System.out.println("Average score for course #" + (j + 1) + ": " + sumForEachStudent / 4);
//         }
//     }
// }

import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentCount = input.nextInt();

        System.out.print("Enter number of courses: ");
        int courseCount = input.nextInt();

        int[][] score = new int[studentCount][courseCount];

        double sumForEachStudent = 0;

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter scores for student #" + (i + 1));
            sumForEachStudent = 0;

            for (int j = 0; j < courseCount; j++) {
                System.out.print("Course #" + (j + 1) + " Score: ");
                score[i][j] = input.nextInt();
                sumForEachStudent += score[i][j];
            }

            System.out.println("Average score: " + (sumForEachStudent / courseCount));
        }

        for (int j = 0; j < courseCount; j++) {
            sumForEachStudent = 0;
            for (int i = 0; i < studentCount; i++) {
                sumForEachStudent += score[i][j];
            }
            System.out.println("Average score for course #" + (j + 1) + ": " + (sumForEachStudent / studentCount));
        }
    }
}
