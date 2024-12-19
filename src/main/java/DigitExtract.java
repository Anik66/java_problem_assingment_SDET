import java.util.Arrays;

public class DigitExtract {
    public static void main(String[] args) {

        String message = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        message = message.replaceAll("[^\\d]", " ");
        message = message.trim();
        message = message.replaceAll(" +", " ");
        String[] arr = message.split(" ");



        double LaptopPrice = Double.parseDouble(arr[1]);
        double MousePrice = Double.parseDouble(arr[2]);

//        System.out.println(LaptopPrice);
//        System.out.println(MousePrice);

        double totalPrice = LaptopPrice + MousePrice;

        double TotalDiscount = 0.15 * totalPrice;
        double finalPrice = totalPrice - TotalDiscount;



       //System.out.println("Total Price: " + totalPrice);
        System.out.println("Digit After extraction :" +Arrays.toString(arr));
        System.out.println("Price After discount: " + finalPrice + " tk");
    }
}
