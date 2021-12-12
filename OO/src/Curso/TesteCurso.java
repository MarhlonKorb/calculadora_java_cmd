package Curso;

public class TesteCurso {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marhlon");
        Aluno aluno2 = new Aluno("Marcos");
        Aluno aluno3 = new Aluno("Marmore");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("React Native");
        Curso curso3 = new Curso("C++");

        curso1.adicionarCurso(aluno1);
        curso2.adicionarCurso(aluno1 );

        curso2.adicionarCurso(aluno2);
        curso2.adicionarCurso(aluno3);
        
        curso1.adicionarCurso(aluno3);
        curso3.adicionarCurso(aluno1);

        System.out.println("Alunos matriculados no curso 1 ");
        for (Aluno aluno: curso1.alunos
             ) {
            System.out.println(aluno.nomeAluno);
        }
    }

}
