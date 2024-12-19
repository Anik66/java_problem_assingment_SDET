import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter  string: ");
        String userInput = sc.nextLine();
        binaryCheck(userInput);

        sc.close();
    }

    public static  void  binaryCheck(String binary) {
        boolean found = true;
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch !='1' && ch!='0' ) {
                found = false;

            }
        }
        if (found == false) {
            System.out.println(found);
        }
        else {
            System.out.println(found);
        }


    }


}



