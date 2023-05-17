import java.time.LocalDate;

public class Figurinha {
    private String nomeJogador;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String nomeJogador, LocalDate dataNascimento, double altura, double peso, String posicao, String pais) {
        this.nomeJogador = nomeJogador;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public void MostrarFigurinha() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("País: " + pais);
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }
}
