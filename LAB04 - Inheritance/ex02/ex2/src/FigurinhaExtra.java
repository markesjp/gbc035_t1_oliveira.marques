public class FigurinhaExtra extends Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nomeDoJogador, String dataDeNascimento, int altura, double peso, String posicao, String pais, String categoria, String cor) {
        super(nomeDoJogador, dataDeNascimento, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    public void mostrarFigurinha() {
        super.mostrarFigurinha();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }
}