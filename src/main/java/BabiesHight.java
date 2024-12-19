
import java.util.Scanner;

public class BabiesHight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] Height = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height for babies  number " + (i + 1) + " in cm: ");
            Height[i] = sc.nextDouble();
        }

        sc.close();

        lowestHeight(Height);


    }

    public  static  void lowestHeight(double[] Height) {
          double  lowest = Height[0];
          double SecondLowest = Double.MAX_VALUE;
        for (int i = 0; i < Height.length; i++) {
            if (Height[i] < lowest) {
                SecondLowest = lowest;
                lowest = Height[i];
            }

            else if (Height[i] < SecondLowest && Height[i] != lowest) {
                SecondLowest = Height[i];
            }

        }
        System.out.println( "The lowest hight of babies :" + lowest  + " in cm");
        System.out.println( "The second lowest hight of babies :" + SecondLowest + " in cm");
    }


}
