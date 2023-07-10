package com.mycompany.associacoes;


public class Associacoes {

     public static void main(String[] args) {
     
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

       
        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("História");

       
        aluno1.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina2);
        aluno2.adicionarDisciplina(disciplina1);

       
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : aluno1.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }

        System.out.println();

        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : aluno2.getDisciplinas()) {
            System.out.println("- " + disciplina.getNome());
        }

        
        System.out.println();
        System.out.println("Disciplina: " + disciplina1.getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : disciplina1.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }
    }
}
