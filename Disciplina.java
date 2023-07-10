package com.mycompany.associacoes;

public class Disciplina {
     private String nome;
    private List<Aluno> alunos;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
