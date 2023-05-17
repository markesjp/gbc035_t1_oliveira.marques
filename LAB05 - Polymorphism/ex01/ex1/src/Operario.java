public class Operario extends Funcionario {
    private double valorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, String dataNascimento, double salario, double valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double calcularSalario() {
        return valorProducao * quantidadeProduzida;
    }
}