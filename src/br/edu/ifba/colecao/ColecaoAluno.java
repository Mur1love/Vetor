package br.edu.ifba.colecao;

import java.util.Arrays;

import br.edu.ifba.basicas.Aluno;

public class ColecaoAluno {
	
	private Aluno[] a = new Aluno[10];
	
	int cont = 0;
	
	public void addAluno (Aluno aluno) {
		
		for (int i = 0; i < this.a.length; i++) {
			if (this.a[i] == null) {
				this.a[i] = aluno;
				break;
				
			}
			
		}
		
	}
	
	public void cadastrarAlunoOtimizado(Aluno aluno) {
		
		this.a[cont] = aluno;
		cont++;
		
	}
	
	public Aluno[] retornoAluno() {
		Arrays.sort(this.a);
		return this.a;
	}

}
