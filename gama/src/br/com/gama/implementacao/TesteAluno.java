package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;

public class TesteAluno {
	
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Itaquera");
		endereco.setLogradouro("Avenida Itaquera");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Viela 123");
		endereco.setNumero("385");
		endereco.setCep("32717-485");
		endereco.setUf("SP");
		
		
								
		Aluno aluno = new Aluno();
		
		aluno.setEndereco(endereco);
		aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone"));
		aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula")));
		
		System.out.println(aluno.toString());
		
	
		Aluno aluno2 = new Aluno();
	
		aluno2.setAll(
				endereco,
				JOptionPane.showInputDialog("Nome 2").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Matricula 2")),
				JOptionPane.showInputDialog("Email 2").toLowerCase(),
				JOptionPane.showInputDialog("Fone 2")
				);
	
	
		System.out.println(aluno2.toString());
		
		
		//setar o professor
		Professor professor = new Professor();
	
		professor.setNome("Humberto");
		professor.setFormacao("TI");
		professor.setArea("JAVA");
		professor.setEndereco(endereco);
		
		System.out.println(professor.getResumo());
		
		
		//setar curso
		Curso curso = new Curso();
		
		curso.setSigla("EM101");
		curso.setAtivo(true);
		curso.setDescricao("Curso básico de programação");
		curso.setDuracao((byte)3);
		curso.setValor((float)100);

		System.out.println(curso.toString());
		curso.atualizarValor((float)10);
		System.out.println(curso.toString());
		
		//setar turma
		
		Turma turma = new Turma();
		
		turma.setAluno(aluno2);
		turma.setCurso(curso);
		turma.setPeriodo("diurno");
		turma.setProfessor(professor);
		turma.setSigla("Doti 16c");
		
		System.out.println(turma.toString());
		System.out.println(turma.getResumo());
		
		//pegando usuário do aluno 2
		System.out.println(aluno2.getUsuario());
	
	
	}
}
