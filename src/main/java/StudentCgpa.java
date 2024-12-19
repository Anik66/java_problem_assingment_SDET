public class StudentCgpa {
    public static void main(String[] args) {
      double [] CGPA = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

         SecondHighest(CGPA);
    }

    public static void SecondHighest(double [] CGPA){
        double max =CGPA[0];
        double SecondMax = CGPA[0];

        for(int i=1;i<CGPA.length;i++){
            if(CGPA[i]>max){
                SecondMax=max;
                max = CGPA[i];
            }
            else if(CGPA[i]>SecondMax && SecondMax != max){
                SecondMax=CGPA[i];
            }

        }
        System.out.println("The Second Highest CGPA:"+SecondMax);



    }

}



