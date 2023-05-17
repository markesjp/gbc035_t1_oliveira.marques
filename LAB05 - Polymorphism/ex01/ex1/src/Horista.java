public class Horista extends Funcionario {
    private double valorHora;
    private int totalHorasTrabalhadas;

    public Horista(String nome, String dataNascimento, double salario, double valorHora, int totalHorasTrabalhadas) {
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * totalHorasTrabalhadas;
    }
}