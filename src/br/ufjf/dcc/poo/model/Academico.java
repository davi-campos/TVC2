package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Academico extends Pessoa {
	///atributos
	private int academicoId;
	private ArrayList<Disciplina> disciplinas;
	
	//getters e setters
	public int getAcademicoId() {
		return academicoId;
	}

	public void setAcademicoId(int academicoId) {
		this.academicoId = academicoId;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	//metodos
	public void imprimirGrade() {
		
	}
	
	
}
