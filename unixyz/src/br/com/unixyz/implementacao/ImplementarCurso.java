package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		Curso curso = new Curso(
				Integer.parseInt(JOptionPane.showInputDialog("id")),
				JOptionPane.showInputDialog("descricao"),
				Float.parseFloat(JOptionPane.showInputDialog("valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Carga Hor�ria"))		
				);
		System.out.println(curso.getAll());
		
	}// fim MAIN

}// fim da classe
