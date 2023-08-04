package aula_030823;

import java.time.LocalDate;

public class Cliente {
    private int idade;
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;

    public Cliente(){

    }

    public Cliente(int idade, String nome, String cpf, String email, LocalDate dataNascimento) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void inserirNome(String novoNome){
        nome = novoNome;
    }

    public String obterNome(){
        return nome;
    }

    public void inserirIdade(int novaIdade){
        if (0 < idade){
            idade = 0;
        }
        else {
            idade = novaIdade;
        }
    }

    public int obterIdade(){
        return idade;
    }
}
