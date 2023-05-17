import java.time.LocalDate;

class Operario extends Funcionario {
    private double valorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, String dataNascimento, double valorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento, 0);
        this.valorProducao = valorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double calcularSalario() {
        return valorProducao * quantidadeProduzida;
    }
}