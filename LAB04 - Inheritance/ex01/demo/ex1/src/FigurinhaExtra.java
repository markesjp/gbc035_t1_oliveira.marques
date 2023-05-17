public class FigurinhaExtra {
    private String nomeJogador;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nomeJogador, String dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
        this.categoria = categoria;
        this.cor = cor;
    }

    public void mostrarFigurinha() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }
}
