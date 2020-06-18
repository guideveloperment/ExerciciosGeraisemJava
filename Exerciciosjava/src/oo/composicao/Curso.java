package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	
	void adiconarAluno (Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
}
