package aula_040823.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<Conta>();
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void criarConta(Cliente cliente){
        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.setSaldo(0.0);
        conta.setNumeroConta(this.contas.size() + 1);
        this.contas.add(conta);
    }

    public Conta buscarConta(Integer numero){
        for (Conta c : contas){ //Conta c está recebendo cada conta da lista
            if (c.getNumeroConta().equals(numero)){
                return c;
            }
        }
        return null;
    }

    public void listarContas(){
        for (Conta c : contas) {
            System.out.println(contas);
        }
    }
}
