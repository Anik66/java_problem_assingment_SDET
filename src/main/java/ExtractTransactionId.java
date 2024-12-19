public class ExtractTransactionId {
    public static void main(String[] args) {
        String str= "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        str = str.replaceAll("[^A-Z0-9]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            // Print both the value and the index
//            System.out.println("index: " + i + ", value: " + arr[i]);
//        }
        String TransactionId = arr[8];
        System.out.println( " Transaction Id:"+TransactionId);



    }
}
