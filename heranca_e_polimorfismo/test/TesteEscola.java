package test;

import model.Aluno;
import model.GerenciaEscola;
import model.Professor;
import model.Pessoa1;

public class TesteEscola {

	public static void main(String[] args) {
		
		Pessoa1 aluno = new Aluno();
		aluno.setNome("Julia");
		
		Pessoa1 professor = new Professor();
		professor.setNome("Felipe");
		
		GerenciaEscola g = new GerenciaEscola();
		
		System.out.println(g.imprimeNome(aluno));
		System.out.println(g.imprimeNome(professor));
	}
}
