package aula_040823.cursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudoComposicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Lucas", "123456");
        Aluno aluno2 = new Aluno("Mariana", "128746");
        Aluno aluno3 = new Aluno("Livia", "470456");

        List<Aluno> alunos = new ArrayList<Aluno>(List.of(aluno1, aluno2, aluno3));

        Professor professor = new Professor("Gabriel", "12345678-8");
        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAlunos().get(2).getNome());
    }
}
