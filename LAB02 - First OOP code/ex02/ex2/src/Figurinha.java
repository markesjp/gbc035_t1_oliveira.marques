public class Figurinha {
    private String nome;
    private String dataNascimento;
    private int altura;
    private int peso;
    private String posicao;
    private String pais;

    public Figurinha(String nome, String dataNascimento, int altura, int peso, String posicao, String pais) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }
}
