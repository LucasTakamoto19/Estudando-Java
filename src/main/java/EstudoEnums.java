enum NivelAcesso{
    COMUM, USUARIO, ADMINISTRADOR
}


class Pessoa{
    public String nome;
    public  int idade;
    public NivelAcesso nivelAcesso;

    public Pessoa(String nome, int idade, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.idade = idade;
        this.nivelAcesso = nivelAcesso;
    }
}


public class EstudoEnums {
    public static void main(String[] args) {
        Pessoa guedes = new Pessoa("Guedes", 25, NivelAcesso.USUARIO);

        if (guedes.nivelAcesso == NivelAcesso.ADMINISTRADOR){
            System.out.println("Libera tudo!");
        } else if (guedes.nivelAcesso == NivelAcesso.USUARIO) {
            System.out.println("Libera somente area privada!");
        } else if (guedes.nivelAcesso == NivelAcesso.COMUM) {
            System.out.println("Libera somente area publica!");
        }
    }
}
