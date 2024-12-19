public class RemoveVowels {
    public static void main(String[] args) {
        String mystr =" I am a SQA Engineer";
        mystr = mystr.toLowerCase();
         removeVowels(mystr);

    }

    public static String removeVowels(String mystr) {
        String VowelsRemove = mystr.replaceAll("[aeiou]", "").trim();
        System.out.println("sentence After remov volwes: "+VowelsRemove);
        return VowelsRemove;
    }


}
