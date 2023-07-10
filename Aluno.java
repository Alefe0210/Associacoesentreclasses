package com.mycompany.associacoes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.adicionarAluno(this);
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
        disciplina.removerAluno(this);
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
