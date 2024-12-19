import java.util.Scanner;

public class Note {
    public static void main(String[] args) {

        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  amount: ");
        int amount = sc.nextInt();

        sc.close();
        countNotes(amount, notes);
    }

    public static void countNotes(int amount, int[] notes) {

        for(int i = 0; i < notes.length; i++) {
          int AmountCount =  amount/notes[i];
            amount =amount%notes[i];
            if(AmountCount >0) {
                System.out.println(+ notes[i] + " " + AmountCount);
            }

        }

    }
}

