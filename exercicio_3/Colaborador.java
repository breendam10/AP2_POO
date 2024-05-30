package ap2_ex3;

/*
O Princípio da Responsabilidade Única (SRP) sugere que uma classe deve
ser responsável por APENAS UMA funcionalidade específica do sistema.

Vantagens:
- Coesão: Uma classe com uma única responsabilidade é mais coesa, pois não está tentando realizar várias tarefas diferentes. Isso ajuda a manter o código mais organizado e fácil de entender.
- Testabilidade: Classes com uma única responsabilidade são mais fáceis de testar, pois seus comportamentos podem ser testados de forma isolada, sem a interferência de outras responsabilidades.
- Manutenibilidade: Quando uma mudança ocorre em uma determinada responsabilidade, apenas a classe afetada precisa ser modificada. Isso reduz o risco de introduzir efeitos colaterais em outras partes do sistema.
- Reutilização: Classes coesas e com uma única responsabilidade são mais propensas a serem reutilizadas em diferentes partes do sistema.
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