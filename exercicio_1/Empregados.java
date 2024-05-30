//package ap2Ex1;

public class Empregados {
	// artibutos
		 private int matricula;
		    private String nome;
		    private float salario;
		    
	
     // Construtor da classe   
	public Empregados(int matricula, String nome, float salario) {
	
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}

	//getters e setters
	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
		// condições de aumento
	public void aumento(){
		if(salario <= 1000) {
			salario += salario * 0.20;
		} else if(salario <= 2000){
			salario += salario * 0.15;
		}else if(salario <= 3000) {
			salario += salario * 0.10;
		}else {
			salario += salario * 0.05;
		}
	}
	 
}
