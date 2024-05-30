package ap2_ex3;

/*
O Princípio da Responsabilidade Única (SRP) sugere que uma classe deve
ser responsável por APENAS UMA funcionalidade específica do sistema.
*/

// Classe que EXCLUSIVAMENTE representa um colaborador:
class Colaborador {
	private String nome; // Definição do campo nome
	private int idade; // Definição do campo idade
	private double salario; // Definição do campo salario

	public Colaborador(String nome, int idade, double salario) { // Construtor da classe colaborador que inicializa os campos
		this.nome = nome; // Inicialização do campo 'nome' 
		this.idade = idade; // Inicialização do campo 'idade' 
		this.salario = salario; // Inicialização do campo 'salario'
 }

	// Métodos getters e setters para nome, idade e salario:
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	public int getIdade() { return idade; }
	public void setIdade(int idade) { this.idade = idade; }
	public double getSalario() { return salario; }
	public void setSalario(double salario) { this.salario = salario; }
}
