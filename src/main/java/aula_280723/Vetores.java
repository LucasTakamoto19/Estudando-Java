package aula_280723;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] nums = {1, 2, 3, 4, 5}; // vetor de numeros inteiros
//        System.out.println(nums[4]);
//        nums[4] = 8;
//        System.out.println(nums[4]);
//
//
//        for (int i = 0; i < nums.length; i++){
//            System.out.print(nums[i]);
//        }
//
//        double[] notas = new double[60]; // declara um vetor double vazio com 60 posições
//        notas[59] = 5.6;
//        System.out.println(notas[59]);

        System.out.println("Digite o número de notas:");
        int nNotas = sc.nextInt();

        double[] notas = new double[nNotas];
        for (int i = 0; i < nNotas; i++){
            System.out.println("Digite a nota:");
            notas[i] = sc.nextDouble();
        }

        double media = 0.0;
        for (double nota : notas){
            media += nota;
        }
        media /= nNotas;
        System.out.printf(" média é igual a %.2f", media);


        sc.close();
    }
}
