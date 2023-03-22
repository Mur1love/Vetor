package br.edu.ifba.colecao;

import br.edu.ifba.basicas.Aluno;

public class ColecaoAluno {
	
	private Aluno[] a = new Aluno[10];
	
	public void addAluno (Aluno aluno) {
		
		for (int i = 0; i < this.a.length; i++) {
			if (this.a[i] == null) {
				this.a[i] = aluno;
				break;
				
			}
			
		}
		
	}
	
	public Aluno[] retornoAluno() {
		return this.a;
	}

}
