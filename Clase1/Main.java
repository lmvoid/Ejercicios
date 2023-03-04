import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1= 5;
        int num2= 14;
        System.out.print("Indique 2 si desea ver numero pares o 1 si desea ver impares:");
        Scanner entrada= new Scanner(System.in);
        int entra= entrada.nextInt();
        if(entra==2) {
            while(num1<=num2) {
                int retor = num1 %2;
                if (retor==0){
                    System.out.print(num1);
                    System.out.print(",");
                }
                num1=num1+1;
            }

        }else{
            while(num1<=num2) {
                int retor = num1 %2;
                if (retor==1){
                    System.out.print(num1);
                    System.out.print(",");
                }
                num1=num1+1;
            }
        }

    }
}