package aula010823;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

enum EstacoesDoAno{
    VERAO, OUTONO, INVERNO, PRIMAVERA
}

public class Exercicio0108 {

    public static Double media(List<Double> numeros){
        Double total = 0.0;
        for (Double n : numeros){
            total+= n;
        }
        return (total / numeros.size());
    }

    public static boolean isPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        List<Integer> num = new ArrayList<Integer>();
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Digite um número: ");
//            num.add(sc.nextInt());
//        }
//
//        Integer numMaior = Collections.max(num);
//        Integer numMenor = Collections.min(num);
//
//
//        System.out.println("O maior número é: " + numMaior);
//        System.out.println("O menor número é: " + numMenor);
//

//        List<Double> numeros = new ArrayList<Double>(List.of(2.0, 5.0, 7.0, 9.0, 6.0, 3.0));
//
//
//        System.out.println("A média dos números é " + media(numeros));

//        LocalDate now = LocalDate.now();
//        System.out.println(now.plusWeeks(3));
//
//
//        System.out.println("Digite um número: ");
//        int n = sc.nextInt();
//        if (isPrimo(n)){
//            System.out.println("É primo!");
//        }
//        else {
//            System.out.println("Não é primo!");
//        }

//        System.out.println("Digite o mês do ano (1-12):");
//        int mes = sc.nextInt();
//        switch (mes){
//            case 1:
//            case 2:
//            case 3:
//                System.out.println(EstacoesDoAno.VERAO);
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println(EstacoesDoAno.OUTONO);
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println(EstacoesDoAno.INVERNO);
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println(EstacoesDoAno.PRIMAVERA);
//                break;
//        }
    }
}