package aula_020823;

public class EstudoClasses {
    public static void main(String[] args) {
        Fruta maca = new Fruta();

        maca.nome = "Maçã";
        maca.cor = "Vermelha";
        maca.acidez = 7;
        maca.suculencia = true;
        maca.amadurecer(37);
        maca.vitaminas = new String[3];
        maca.vitaminas[0] = "Vitamina A";
        maca.vitaminas[1] = "Vitamina D";
        maca.vitaminas[2] = "Vitamina G";

        System.out.println(maca.maduro);

        System.out.println(maca);
    }
}
