package aula_040823.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Cliente cliente1 = new Cliente("Lucas", 21, "12345678-9");
        Cliente cliente2 = new Cliente("Mariana", 20, "12345678-9");
        Cliente cliente3 = new Cliente("Livia", 12, "12345678-9");

        Banco banco = new Banco();

        banco.criarConta(cliente1);
        banco.criarConta(cliente2);
        banco.criarConta(cliente3);

        banco.buscarConta(3).depositar(1000.0);
        banco.buscarConta(3).sacar(300.0);

        banco.buscarConta(2).depositar(1100.0);
        banco.buscarConta(2).sacar(500.0);
        banco.buscarConta(2).sacar(200.0);

        banco.listarContas();

    }
}
