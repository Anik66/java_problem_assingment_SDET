import java.util.Random;

public class Password {
    public static void main(String[] args) {

        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String mystr1 = str1.toUpperCase();
        String mystr3 = "0123456789";
        String mystr4 = "!@#$%&*^";


        String MyFullstr = mystr1 + str1 + mystr3 + mystr4;

        GeneratePassword(str1,mystr1,mystr3,mystr4,MyFullstr);

    }

    public  static  void GeneratePassword(String str1, String mystr1,String mystr3,String mystr4,String MyFullstr) {

        StringBuilder password = new StringBuilder();


        Random random = new Random();

        password.append(str1.charAt(random.nextInt(str1.length())));
        password.append(mystr1.charAt(random.nextInt(mystr1.length())));
        password.append(mystr3.charAt(random.nextInt(mystr3.length())));
        password.append(mystr4.charAt(random.nextInt(mystr4.length())));

        for (int i = 4; i < 8; i++) {
            password.append(MyFullstr.charAt(random.nextInt(MyFullstr.length())));
        }

        String finalPassword = password.toString();
        System.out.println("Password:" +finalPassword);

    }




}
