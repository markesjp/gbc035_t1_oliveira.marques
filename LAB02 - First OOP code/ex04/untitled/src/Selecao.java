public class Selecao {
    private String nomeSelecao;
    private Figurinha[] titulares;
    private String nomeTecnico;

    public Selecao(String nomeSelecao, Figurinha[] titulares, String nomeTecnico) {
        this.nomeSelecao = nomeSelecao;
        this.titulares = titulares;
        this.nomeTecnico = nomeTecnico;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public Figurinha[] getTitulares() {
        return titulares;
    }

    public void setTitulares(Figurinha[] titulares) {
        this.titulares = titulares;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

}
