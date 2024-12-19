import java.util.Arrays;
import java.util.Scanner;

public class FindCgpa {

    public static void main(String[] args) {
        double cgpa[] = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the CGPA: ");
        double InputCgpa = input.nextDouble();
        input.close();

        double result = BinarySearch(cgpa, InputCgpa );

        if (result == -1) {
            System.out.println("The CGPA is not found");
        } else {
            System.out.printf("The CGPA is found: %.2f%n", InputCgpa);
        }
    }

    public static double BinarySearch(double[] cgpa, double target) {
        int left = 0;
        int right = cgpa.length - 1;
        double temp;

       //sort all cgpa using for loop
        for (int i = 0; i < cgpa.length; i++) {
            for (int j = i + 1; j < cgpa.length; j++) {
                if (cgpa[i] > cgpa[j]) {
                    temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }

        }




        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (cgpa[mid] == target) {
                return cgpa[mid];
            }

            if (cgpa[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

