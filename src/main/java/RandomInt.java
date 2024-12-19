import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numberRandom(numbers);
    }


    public static void numberRandom(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.print("Generated Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        int max = numbers[0];
        int min = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        System.out.println("\nMax Number: " + max);
        System.out.println("Min Number: " + min);
    }
}
