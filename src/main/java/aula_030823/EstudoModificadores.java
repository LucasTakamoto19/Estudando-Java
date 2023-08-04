package aula_030823;

public class EstudoModificadores {
//    Modificadires
//      - Acesso
//            => public (pode-se acessar fora da classe e fora do pacote que ele foi definido)
//            => private (não se pode acessar fora da classe, somente dentro da propria classe)
//            => protected (acesso somente pela propria classe e por seu filho)
//            => default (padrão) (acesssado somente por classes no mesmo pacote)
//      - Não acesso
//            => static (membro da classe)
//            => final (definir uma constante)


    public static void main(String[] args) {

        Cliente mariana = new Cliente();
        mariana.inserirNome("Mariana");
        mariana.inserirIdade(20);
        System.out.println(mariana.obterNome() + mariana.obterIdade());
    }


}
