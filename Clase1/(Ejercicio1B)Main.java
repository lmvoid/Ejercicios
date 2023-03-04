public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 14;
        while(num1<=num2) {
            int retor = num1 %2;
            if (retor==0){
                System.out.print(num1);
                System.out.print(",");
            }
            num1=num1+1;
            }
        }

}
