package aula_040823.exercicio;


public class Conta {


    private Integer numeroConta;
    private Double saldo;
    private Cliente cliente;

    public Conta(){

    }

    public Conta(Integer numeroConta, Double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void depositar(Double valor){
        if (valor > 0.0) {
            this.saldo += valor;
        }
    }

    public void sacar(Double valor){
        if (valor >= 0.0){
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString(){
        return "numero" + numeroConta + "saldo: " + saldo + "cliente: " + cliente;
    }
}
