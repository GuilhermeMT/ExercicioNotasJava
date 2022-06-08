package sourceCode;

public class Aluno {

	private String nome;
	private String ra;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	private boolean aprovado;
	
	public Aluno() { }
	
	public Aluno(String nome, String ra, double nota1, double nota2, double nota3, double nota4, boolean aprovado) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.aprovado = aprovado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	public void calcularMedia() {
		this.media = (nota1 + nota2 + nota3 + nota4)/4;
		if(media >= 5) {
			setAprovado(true);
		}else {
			setAprovado(false);
		}
	}
	
}
