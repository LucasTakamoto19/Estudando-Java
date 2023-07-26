import java.util.Locale;
import java.util.Scanner;

public class estruturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.println("Seu IMC é: " + imc);

        if (imc < 17){
            System.out.println("Muito abaixo do peso.");
        } else if(imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        } else if(imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");
        } else if(imc >= 30 && imc < 35) {
            System.out.println("Obesidade I");
        } else if(imc >= 35 && imc < 40) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade III");
        }


        System.out.println("Selecione uma dieta (1 a 3)");
        System.out.println("1 - água");
        System.out.println("2 - fruta");
        System.out.println("3 - batata");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Você escolheu a dieta da água");
                break;
            case 2:
                System.out.println("Você escolheu a dieta fruta");
                break;
            case 3:
                System.out.println("Você escolheu a dieta batata!");
                break;
            default:
                System.out.println("Escolha uma dieta válida!");
                break;
        }

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(mensagem);


        System.out.println("Digite qunatos alimentos você come?");
        int total = sc.nextInt();

        for (int i = 0; i < total; i++){
            System.out.println("Você gosta de batata!");
        }
        int i = 0;

        while(i < total) {
            System.out.println("Você gosta de batata!");
            i++;
        }

        int j = 0;

        do {
            System.out.println("Você gosta de batata!");
            j++;
        } while (j < total);


        sc.close();
    }
}
