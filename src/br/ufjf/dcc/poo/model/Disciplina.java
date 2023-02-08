package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Disciplina {
	///atributos
	private String nomeDisciplina;
	private int periodo;
	private String livroTexto;
	private Professor professor;
	private ArrayList<Academico> academicos;
	
	//getters e setters
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getLivroTexto() {
		return livroTexto;
	}
	public void setLivroTexto(String livroTexto) {
		this.livroTexto = livroTexto;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Academico> getAcademicos() {
		return academicos;
	}
	public void setAcademicos(ArrayList<Academico> academicos) {
		this.academicos = academicos;
	}
	
	//metodos
	public void quantidadeAcademicos() {
				
	}
	public void imprimirDiario() {
		
	}
}
