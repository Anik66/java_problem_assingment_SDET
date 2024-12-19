public class CountWord {
    public static void main(String[] args) {
        String mystr = "I am a SQA Engineer";
        String mystr1 = mystr.toLowerCase();


        WordCount(mystr1);
    }

    public static void WordCount(String mystr) {
        char[] chars = mystr.toCharArray();
        String[] words = mystr.split(" ");

        int count = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < chars.length; i++) {

            if (mystr.charAt(i)!= ' ') {
                count++;
            }

            if (mystr.charAt(i) == 'a' || mystr.charAt(i) == 'e' || mystr.charAt(i) == 'i' || mystr.charAt(i) == 'o' || mystr.charAt(i) == 'u') {
                vowelCount++;
            }

            else if (mystr.charAt(i)>= 'a' && mystr.charAt(i)<= 'z') {
                consonantCount++;
            }
        }


        System.out.println("Words: " + words.length);
        System.out.println("Chars: " + count);
        System.out.println("Vowel : " + vowelCount);
        System.out.println("Consonant : " + consonantCount);
    }
}
