package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
	///atributos
	private float salarioBase;
	private int numAulas;
	private int numDisciplinas;
	private ArrayList<Disciplina> disciplinas;
	
	
	//getters e setters
	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getNumAulas() {
		return numAulas;
	}

	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}

	public int getNumDisciplinas() {
		return numDisciplinas;
	}

	public void setNumDisciplinas(int numDisciplinas) {
		this.numDisciplinas = numDisciplinas;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	//metodos
	public void salario() {
		
	}

}
