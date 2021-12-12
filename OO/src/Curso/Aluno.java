package Curso;

import java.util.ArrayList;

public class Aluno {
    String nomeAluno;

    Aluno(String nome){
        this.nomeAluno = nome;
    }

    ArrayList<Curso> cursos = new ArrayList<>();

    void adicionarAluno(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
