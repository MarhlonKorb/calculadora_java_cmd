package Curso;

import java.util.ArrayList;

public class Curso {
        String nome;

        Curso(String nome){
            this.nome = nome;
        }
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarCurso(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
