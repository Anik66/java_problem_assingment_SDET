import java.util.Arrays;

public class SortCgpa {
    public static void main(String[] args) {
        double [] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        sortCGPA(CGPA);
    }

    public static void sortCGPA(double[] CGPA) {
        double temp ;

        for (int i = 0; i < CGPA.length; i++) {
            for (int j = i + 1; j < CGPA.length; j++) {
                if (CGPA[i] < CGPA[j]) {
                    temp = CGPA[i];
                    CGPA[i] = CGPA[j];
                    CGPA[j] = temp;
                }
            }

        }
        System.out.print("Sorted Cgpa:");
        for (int i = 0; i < CGPA.length; i++) {
            System.out.printf( "%.2f ",CGPA[i]   );



        }

    }
}
