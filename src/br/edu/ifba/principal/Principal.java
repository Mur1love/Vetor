package br.edu.ifba.principal;

import java.util.Arrays;
import java.util.Scanner;

import br.edu.ifba.basicas.Aluno;
import br.edu.ifba.colecao.ColecaoAluno;

public class Principal {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		ColecaoAluno ca = new ColecaoAluno();
		

		for (int i = 0; i < 5; i++) {
			
			Aluno a = new Aluno();
			System.out.println("Digite o nome do aluno:");
			a.setNome(sc.nextLine());
			System.out.println("Digite o CPF do aluno:");
			a.setCpf(sc.nextLine());
			System.out.println("Digite a matricula do aluno:");
			a.setMatricula(sc.nextLine());

			ca.cadastrarAlunoOtimizado(a);
			
			sc.close();
		}

		System.out.println(Arrays.toString(ca.retornoAluno()));

	}

}
