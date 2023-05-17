public class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double salario, double valorFixo, double comissao, double vendas) {
        super(nome, dataNascimento, salario);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + valorFixo + comissao * vendas;
    }
}