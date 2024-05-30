package ap2_ex3;

// Classe responsável EXCLUSIVAMENTE pelo cálculo de bônus do colaborador:
class CalculaBonus {
	public double calculaBonus(Colaborador colaborador) {
		// Calcula 10% do salário como bônus
		return colaborador.getSalario() * 0.10;
	}
}