package aula_280723;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu e-mail:");
        String email = sc.nextLine();
        System.out.println("Digite sua senha:");
        String senha = sc.nextLine();

        if (email.contains("@soulcode.com")){
            System.out.println("Seu e-mail é válido!");
        }
        else{
            System.out.println("Seu e-mail é inválido!");
        }

        if (senha.length() >= 8){
            System.out.println("Senha válida");
        }
        else {
            System.out.println("Senha inválida");
        }

//

        float[] vet1 = {1.1F, 2.5F, 3.3F, 4.4F, 5.0F};
        float[] vet2 = {1.1F, 2,5F, 3.3F, 4.4F, 5.0F};
        float[] vet3 = new float[5];

        for (int i = 0; i < vet3.length; i++){
            vet3[i] = vet1[i] + vet2[1];
            System.out.println(vet3[i]);
        }


        sc.close();
    }
}
