package questao02;

public class FPadrao extends Funcionario {

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public double calcularProventos(){
        return getSalario();
    }
    public String toString(){
        return "Nome: " +getNome() + "\n" + "Matricula: " + "\n" +getMatricula() + "\n" + "Salário: " + calcularProventos();
    }
}
