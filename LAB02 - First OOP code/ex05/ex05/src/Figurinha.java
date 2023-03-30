public class Figurinha {
    private String nome;
    private String dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    public Figurinha(String pais) {
        this.nome = "Sem nome";
        this.dataNascimento = "01/01/2000";
        this.altura = 1.70;
        this.peso = 70.0;
        this.posicao = "Sem posição";
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
