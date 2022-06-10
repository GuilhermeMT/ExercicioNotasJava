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

		switch (opcao) {
		case 0:
			inserirDados();
			break;
		case 1:
			exibirRelatorio();
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
		
		double [] nota = new double[10];
		
		for (int i = 0; i < 4; i++) {
			boolean validar = false;
			do {
				try {
					nota[i] = Double.parseDouble(
							JOptionPane.showInputDialog("Digite a "+(i + 1)+" nota do aluno:")
							.replace(",", "."));
					validar = verificarNota(nota[i]);
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite apenas números!");
					validar = false;
				}
			} while (!validar);
			
		}
		
		aluno.setNota1(nota[0]);
		aluno.setNota2(nota[1]);
		aluno.setNota3(nota[2]);
		aluno.setNota4(nota[3]);
		
		alunos.add(aluno);
		
	}
	
	private boolean verificarNota(double nota) {
		
		if(nota > 10) {
			JOptionPane.showMessageDialog(null, "A nota n�o pode ser maior que 10!");
			return false;
		}else if(nota < 0) {
			JOptionPane.showMessageDialog(null, "A nota n�o pode ser menor que 0!");
			return false;
		}else
		
		return true;
	}
	
	private void exibirRelatorio() {
		String mensagem = "", aprovado = "";
		
		for(int i=0; i < alunos.size(); i++) {
			alunos.get(i).calcularMedia();
			
			if(alunos.get(i).isAprovado() == true){
				aprovado = "Aprovado";
			}else {
				aprovado = "Reprovado";
			}
			
			mensagem += alunos.get(i).getNome() +" RA: "
					+ alunos.get(i).getRa()
					+ "\nNota 1: "+alunos.get(i).getNota1()
					+ "\nNota 2: "+alunos.get(i).getNota2()
					+ "\nNota 3: "+alunos.get(i).getNota3()
					+ "\nNota 4: "+alunos.get(i).getNota4()
					+" Nota Final: " 
					+ alunos.get(i).getMedia() 
					+ "\n"
					+ "Situação: " + aprovado 
					+ "\n---------------------------------\n";
			
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
