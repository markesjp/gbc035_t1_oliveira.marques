public class Figurinha {
    protected String nomeDoJogador;
    protected String dataDeNascimento;
    protected int altura;
    protected double peso;
    protected String posicao;
    protected String pais;

    public Figurinha(String nomeDoJogador, String dataDeNascimento, int altura, double peso, String posicao, String pais) {
        this.nomeDoJogador = nomeDoJogador;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void mostrarFigurinha() {
        System.out.println("Nome do jogador: " + nomeDoJogador);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }
}