public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // construtor para inicializar as propriedades
    public Produto() {
    }

    // métodos para acessar e modificar as propriedades
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double altera_preco(double porcentagem){
        double temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
            preco = (preco)*temp;  // preço modificado
            return preco;
        } else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return "\nNome: "+this.getNome()+" Preco: "+this.getPreco()+" Qnt Estoque: " + this.getQuantidadeEstoque();
    }
}

