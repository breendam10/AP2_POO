package ap2_ex3;

public class Principal {
	 public static void main(String[] args) {
		 // Cria uma instância de Colaborador
		 Colaborador colaborador = new Colaborador("Beatriz Vieira", 22, 200);
		 
		// Cria uma instância de CalculaBonus
	     	CalculaBonus calculaBonus = new CalculaBonus();
	     	System.out.println("Bonus: " + calculaBonus.calculaBonus(colaborador));

	     	// Cria uma instância de SalvaDados
	     	SalvaDados salvaDados = new SalvaDados();
	     	// Salva os dados do colaborador
	     	salvaDados.save(colaborador);
	 }
}