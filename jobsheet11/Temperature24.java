import java.util.Scanner;
public class Temperature24 {
    public static void main(String[] args) {
        double temp[][] = new double[5][7];
        String[] cities = {"Osaka", "Tokyo", "Sapporo", "Fukuoka", "Naha"};
        Scanner input = new Scanner(System.in);
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[0].length; j++){
                temp[i][j] = input.nextDouble();
            }
        }

        for(double[] cityTemp: temp){
            for(double dayTemp: cityTemp){
                System.out.print(dayTemp + " - ");
            }
            System.out.println();
        }
    }
}
