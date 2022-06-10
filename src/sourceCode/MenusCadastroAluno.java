package sourceCode;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MenusCadastroAluno {
	
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void cadastrarAluno() {
		Object[] options = {"Cadastrar Novo Aluno","Continuar","Sair"};
		int opcao = 0;
		do {
		
		opcao = JOptionPane.showOptionDialog(null, "Cadastro de notas de alunos.\nTotal de"
				+ " alunos cadastrados: " + alunos.size(), "Aviso",
		          JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		              null, options, options[0]);
		
		System.out.println(opcao);
		
		switch (opcao) {
		case 0:
			inserirDados();
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		case -1:
			break;
		}
		
		}while(opcao == 0);
		
	}
	
	private void inserirDados() {
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno:"));
		
		aluno.setRa(JOptionPane.showInputDialog("Digite o RA do aluno:"));
		
		double nota;
		
		do {
		nota = Double.parseDouble(
				JOptionPane.showInputDialog("Digite a primeira nota do aluno:"));
		}while(!verificarNota(nota));
		aluno.setNota1(nota);
		
		
		aluno.setNota2(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a segunda nota do aluno:")));
		
		aluno.setNota3(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a terceira nota do aluno:")));
		
		aluno.setNota4(Double.parseDouble(
				JOptionPane.showInputDialog("Digite a quarta nota do aluno:")));
		
	}
	
	private boolean verificarNota(double nota) {
		
		if(nota > 10) {
			JOptionPane.showMessageDialog(null, "A nota não pode ser maior que 10!");
			return false;
		}else if(nota < 0) {
			JOptionPane.showMessageDialog(null, "A nota não pode ser menor que 0!");
			return false;
		}else
		
		return true;
	}

}
