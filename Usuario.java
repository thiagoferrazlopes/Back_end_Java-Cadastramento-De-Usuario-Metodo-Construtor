package AAAulaExercicio1;

public class Usuario {
	
	
	
	String nome;
	int idade;
	double altura;
	
	
	public Usuario() {}
	
	public Usuario(String nome, int idade, double altura) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NOME: " + nome + " / IDADE " + idade + " / Altura " + altura;
	}
	
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
