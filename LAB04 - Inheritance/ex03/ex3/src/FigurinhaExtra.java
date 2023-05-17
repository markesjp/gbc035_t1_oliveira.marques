public class FigurinhaExtra extends Figurinha {
    private String categoria;
    private String cor;

    public FigurinhaExtra(Figurinha figurinha, String categoria, String cor) {
        super(figurinha.getNomeJogador(), figurinha.getDataNascimento(), figurinha.getAltura(), figurinha.getPeso(), figurinha.getPosicao(), figurinha.getPais());
        this.categoria = categoria;
        this.cor = cor;
    }

    public void MostrarFigurinha() {
        super.MostrarFigurinha();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}