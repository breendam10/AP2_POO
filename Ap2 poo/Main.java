//package ap2Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // leitura com scanner
        ArrayList<Empregados> empregados = new ArrayList<>(); // armazenda objestos com os empregados

        // dados dos empregados
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a matrícula do empregado " + (i + 1) + ": ");
            int matricula = scanner.nextInt();
            scanner.nextLine();  //  nova linha
            System.out.println("Digite o nome do empregado " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.println("Digite o salário do empregado " + (i + 1) + ": ");
            float salario = scanner.nextFloat();
            // cria novo objeto
            Empregados empregado = new Empregados(matricula, nome, salario);
            empregado.aumento();
            empregados.add(empregado);
        }

        // Imprime a matrícula e o nome dos empregados 
        System.out.println("Empregados com salário acima de R$ 3.000,00:");
        for (Empregados emp : empregados) {
            if (emp.getSalario() > 3000) { // caso o salario seja acima de 3.000
                System.out.println("Matrícula: " + emp.getMatricula() + ", Nome: " + emp.getNome().toUpperCase());
            }
        }

        scanner.close();
    }
}
