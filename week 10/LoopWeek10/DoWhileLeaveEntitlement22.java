// import java.util.Scanner;
// public class DoWhileLeaveEntitlement22 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int leaveEntitlement, numLeave;
//         String confirmation;

//         System.out.print("Input your leave entitlement: ");
//         leaveEntitlement = input.nextInt();
//         do{
//             System.out.print("Do you want to take a leave? (y/n)?: ");
//             confirmation = input.next();

//             if(confirmation.equalsIgnoreCase("y")){
//                 System.out.print("How many day(s)?");
//                 numLeave = input.nextInt();

//                 if(numLeave <= leaveEntitlement) {
//                     leaveEntitlement -= numLeave;
//                     System.out.println("Remaining leave entitlement:" +leaveEntitlement);
//                 }else{
//                     System.out.println("You don't have enough leave entitlement.");
//                     break;
//                 }
//             }
//         } while(leaveEntitlement > 0);
//     }
// }


// import java.util.Scanner;
// public class DoWhileLeaveEntitlement22 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int leaveEntitlement, numLeave;
//         String confirmation;

//         System.out.print("Input your leave entitlement: ");
//         leaveEntitlement = input.nextInt();

//         do {
//             System.out.print("Do you want to take a leave? (y/n)?: ");
//             confirmation = input.next();

//             if (confirmation.equalsIgnoreCase("y")) {
//                 do {
//                     System.out.print("How many day(s)? ");
//                     numLeave = input.nextInt();

//                     if (numLeave <= leaveEntitlement) {
//                         leaveEntitlement -= numLeave;
//                         System.out.println("Remaining leave entitlement: " + leaveEntitlement);
//                         break; 
//                     } else {
//                         System.out.println("You don't have enough leave entitlement. Try again.");
//                     }
//                 } while (true); 
//             }

//         } while (leaveEntitlement > 0);

//         System.out.println("No remaining leave entitlement.");
//     }
// }



import java.util.Scanner;
public class DoWhileLeaveEntitlement22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input your leave entitlement: ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("Do you want to take a leave? (y/n/t)?: ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                do {
                    System.out.print("How many day(s)? ");
                    numLeave = input.nextInt();

                    if (numLeave <= leaveEntitlement) {
                        leaveEntitlement -= numLeave;
                        System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                        break; 
                    } else {
                        System.out.println("You don't have enough leave entitlement. Please try again.");
                    }
                } while (true);
            } 
            else if (confirmation.equalsIgnoreCase("n")) {
                System.out.println("You chose not to take leave.");
                break; 
            } 
            else if (confirmation.equalsIgnoreCase("t")) {
                System.out.println("Program terminated by user.");
                break; 
            } 
            else {
                System.out.println("Invalid input! Please enter y, n, or t.");
            }

        } while (leaveEntitlement > 0);

        System.out.println("Program ended. Remaining leave entitlement: " + leaveEntitlement);
    }
}