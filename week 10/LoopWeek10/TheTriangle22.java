// import java.util.Scanner;
// public class TheTriangle22 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int numInput;
//         int i=0;
//         String s =""; 

//         System.out.print("Input some number:");
//         numInput = input.nextInt();

//         while (i < numInput){
//             s +=" *";
//             System.out.println(s);
//             i++;
//         }
//     }
// }

//edited version to FOR statement
// import java.util.Scanner;
// public class TheTriangle22 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         int numInput;
//         String s = "";

//         System.out.print("Input some number: ");
//         numInput = input.nextInt();

//         for (int i = 0; i < numInput; i++) {
//             s += " *";
//             System.out.println(s);
//         }
//     }
// }

//edited version to print in reverse order
import java.util.Scanner;
public class TheTriangle22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numInput;

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = numInput; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

