import java.util.Scanner;

public class IpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an IP address:");
        String ipaddress = sc.nextLine();

        Address(ipaddress);

        sc.close();





}

public  static  void Address( String ipaddress) {
    String[] ip = ipaddress.split("\\.");
    if (ip.length != 4) {
        System.out.println("Invalid IP");
        return;
    }

    for (int i = 0; i < ip.length; i++) {
        String str = ip[i];


        if (str.length() == 0) {
            System.out.println("Invalid IP");
            return;
        }

        if (str.charAt(0) == '0' && str.length() > 1) {
            System.out.println("Invalid IP");
            return;
        }

        int segment= 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) < '0' || str.charAt(j) > '9') {
                System.out.println("Invalid IP");
                return;
            }
            segment = segment * 10 + (str.charAt(j) - '0');
        }

        if (segment < 0 || segment > 255) {
            System.out.println("Invalid IP");
            return;
        }
        if (str.length() > 1 && str.charAt(0) == '0') {
            System.out.println("Invalid IP");
            return;
        }
    }

    if (ip[0].length() == 1) {
        System.out.println("Invalid IP");
        return;
    }

    System.out.println("Valid IP");
}
}