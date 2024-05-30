package ap2_ex3;

// Classe responsável EXCLUSIVAMENTE por salvar os dados do empregado:
class SalvaDados {
	public void save(Colaborador colaborador) {
		// Código para salvar os dados do empregado no banco de dados
		System.out.println("Salvando os dados do colaborador para " + colaborador.getNome());
	}
}