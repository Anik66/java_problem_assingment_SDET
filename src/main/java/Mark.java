public class Mark {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        //int a,b;


      //a+b= 15 /totalQuestions
      //a=15-b
       //a=15-5;
        //a=10

    //5a+10b =100 //totalMarks
    //5(15-b)+15b=100
    //75-5b+10b=100
    //75+5b=100
    //5b=100-75
    //5b=25
    //b=5

        int b = (totalMarks - 5 * totalQuestions) / 5; // Solving for b
        int a = totalQuestions - b;

        System.out.println("5 marks question is:"+a);
        System.out.println("10 marks question is:"+b);













    }
}
