package aula_020823;

public class Fruta {
    String nome;
    String cor;
    float acidez;
    boolean suculenta = false;

    boolean maduro = false;

    String[] vitaminas;

    void amadurecer(int dias){
        maduro = true;
    }
}
