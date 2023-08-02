package aula_260723;

import java.util.Locale;
import java.util.Scanner;

public class operadores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Operador Matemáticos
        int a = 10;
        int b = 20;
        int soma = a + b;
        int subtracao = a - b;
        int multiplica = a * b;
        double c = 10.0;
        double d = 15.0;
        double divisao = d / c;


        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("multiplica: " + multiplica);
        System.out.println("Divisão: " + divisao);

        // Math

        double x = Math.pow(2, 3);
        double y = Math.sqrt(144);

        System.out.println(Math.PI);

        // Incremento ou Decremento

        int valor = 5;
        valor++;
        valor--;
        valor += 10;

        // Operador Relacionados (>, <, >=, <=, ==, !=)

        boolean test = 10 > 5;
        boolean test2 = 5 < 3;
        boolean test3 = 5 == 5;
        boolean test4 = 4 != 5;
        boolean test5 = 5 >= 5;
        boolean test6 = 6 <= 8;

        // Operador Lógicos (&&, ||, !)

        boolean test7 = true && false;
        boolean test8 = true || false;
        boolean test9 = true != false;


        // Exercicio
        double peso = 55;
        double altura = 1.70;

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc);



        sc.close();
    }
}
