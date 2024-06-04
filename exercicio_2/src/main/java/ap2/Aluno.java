
package ap2;

public class Aluno {
    private int matricula; 
    private String nome;
    private int idade;
    private double av1;
    private double av2;

    public Aluno(int matricula, String nome, int idade, double av1, double av2) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.av1 = av1;
        this.av2 = av2;
    }


    public int getMatricula() {
        return matricula;
    }

  
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAv1() {
        return av1;
    }

    public double getAv2() {
        return av2;
    }

    public double calcularMedia() {
        return (av1 + av2) / 2;
    }
}
