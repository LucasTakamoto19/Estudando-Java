import java.util.Scanner;

public class SaidaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // %s mapeia um texto

        String name = "Lucas";

        System.out.printf("Bem vindo, %s!", name);
        System.out.println();


        // %f mapeia um numero flutuante

        double num1 = 3.4;
        double num2 = 12.5;
        double div = num2/num1;
        System.out.printf("A divisão de %.2f e %.2f é igual a %.3f", num1, num2, div);
        System.out.println();


        sc.close();
    }
}
