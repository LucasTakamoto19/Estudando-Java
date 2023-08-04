package aula_040823;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EstudoConstrutores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<String> produtos = new ArrayList<String>();
        produtos.add("Sapato");
        produtos.add("Camiseta");
        produtos.add("blusa");
        Venda venda = new Venda(LocalDate.now(), "Lucas", produtos, 300.0);
        System.out.println(venda);
    }
}
