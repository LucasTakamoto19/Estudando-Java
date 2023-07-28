import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String java = "Java";
//        System.out.println(java.toLowerCase()); // minuscula
//        System.out.println(java.toUpperCase()); // maiuscula
//        System.out.println(java.charAt(3)); // caractere com base na sua posição
//        System.out.println(java.indexOf("va")); // indice do primeiro caractere da substring
//        System.out.println(java.replace("v", "c"));
//        System.out.println(java.replaceAll("a", "i"));
//        System.out.println(java.substring(0, 2));
//
//
//        String nome1 = "Elefante";
//        String nome2 = "Elefante";
//        System.out.println(nome1 == nome2); // Compara os objetos nome1 e nome2
//        System.out.println(nome1.equals(nome2)); // Compara os textos de nome1 e nome2

        String texto = "Aprender Java";
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (texto.contains(palavra)){
            System.out.println("Conteúdo vazio");
        }
        else if(texto.contains(palavra)){
            System.out.println("Contém");
        }
        else{
            System.out.println("Não contém");
        }


        sc.close();
    }
}
