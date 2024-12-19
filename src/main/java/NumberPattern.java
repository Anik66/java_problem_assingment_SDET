public class NumberPattern {
    public static void main(String[] args) {
        pattern2(5);
        pattern(5);


    }

    public  static  void pattern(int n){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public  static  void pattern2(int n){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
