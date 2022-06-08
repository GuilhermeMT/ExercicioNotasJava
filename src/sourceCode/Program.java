package sourceCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		do {
			Object[] options = {"Cadastrar Novo Aluno","Continuar","Sair"};
			opcao = JOptionPane.showOptionDialog(null, "Cadastro de notas de alunos.\nTotal de"
					+ " alunos cadastrados: " + alunos.size(), "Aviso",
			          JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
			              null, options, options[0]);
			
			if(opcao == 0) {
				Aluno aluno = new Aluno();
				
				//Cadastrar nome do aluno
				aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno:"));
				
				//Cadastrar RA do aluno
				aluno.setRa(JOptionPane.showInputDialog("Digite o RA do aluno:"));
				
				//Cadastrar nota1, nota2, nota3 e nota4 do aluno
				aluno.setNota1(Double.parseDouble(
						JOptionPane.showInputDialog("Digite a primeira nota do aluno:")));
				aluno.setNota2(Double.parseDouble(
						JOptionPane.showInputDialog("Digite a segunda nota do aluno:")));
				aluno.setNota3(Double.parseDouble(
						JOptionPane.showInputDialog("Digite a terceira nota do aluno:")));
				aluno.setNota4(Double.parseDouble(
						JOptionPane.showInputDialog("Digite a quarta nota do aluno:")));
				
				alunos.add(aluno);
			}else {
				opcao = 1;
			}
		}while(opcao != 1);
		
		//Calcular média de notas de cada aluno
		String mensagem = "Relatório final de Alunos.\n";
		String aprovado = "Não";
		
		for(int i=0; i < alunos.size(); i++) {
			alunos.get(i).calcularMedia();
			
			if(alunos.get(i).isAprovado() == true){
				aprovado = "Aprovado";
			}else {
				aprovado = "Reprovado";
			}
			
			mensagem += alunos.get(i).getNome() + " Nota Final: " + alunos.get(i).getMedia() + "\n"
					+ "Situação: " + aprovado + "\n-----------\n";
			
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
