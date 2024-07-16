package test;

import dominio.Aluno;
import dominio.Local;
import dominio.Professor;
import dominio.Seminario;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = input.nextLine();

        System.out.println("Digite a idade do aluno: ");
        String idadeAluno = input.nextLine();


        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = input.nextLine();

        System.out.println("Digite a especialidade do professor: ");
        String especialidade = input.nextLine();

        System.out.println("Digite o titulo da palestra: ");
        String titulo = input.nextLine();

        System.out.println("Digite o local: ");
        String endereco= input.nextLine();


        Aluno aluno = new Aluno(nomeAluno,Integer.parseInt(idadeAluno));
        Professor professor = new Professor(nomeProfessor,especialidade);
        Local local = new Local(endereco);
        Aluno[] alunoParaSeminario = {aluno};
        Seminario seminario = new Seminario(titulo,alunoParaSeminario,local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);


        professor.imprime();
        seminario.imprime();



    }
}
