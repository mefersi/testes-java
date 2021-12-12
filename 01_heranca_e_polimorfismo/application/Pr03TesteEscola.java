package application;

import entities.Aluno;
import entities.GerenciaEscola;
import entities.Instrutor;
import entities.Pessoa1;

public class Pr03TesteEscola {

	public static void main(String[] args) {
		
		Pessoa1 aluno = new Aluno();
		aluno.setNome("Julia");
		
		Pessoa1 instrutor = new Instrutor();
		instrutor.setNome("Felipe");
		
		GerenciaEscola g = new GerenciaEscola();
		
		System.out.println(g.imprimeNome(aluno));
		System.out.println(g.imprimeNome(instrutor));
	}
}
