class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private int vendas;

    public Vendedor(String nome, String dataNascimento, double valorFixo, double comissao, int vendas) {
        super(nome, dataNascimento, valorFixo);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public double calcularSalario() {
        return valorFixo + comissao * vendas;
    }
}