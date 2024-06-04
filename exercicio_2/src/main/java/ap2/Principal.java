package ap2;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            int matricula = Integer.parseInt(scanner.nextLine()); 

            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do aluno:");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite a nota AV1:");
            double av1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a nota AV2:");
            double av2 = Double.parseDouble(scanner.nextLine());

            Aluno aluno = new Aluno(matricula, nome, idade, av1, av2);
            alunos.add(aluno);
        }

       
        scanner.close();
    }
}
