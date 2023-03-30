public class Selecao {
    private String nome;
    private Figurinha[] jogadores;
    private String tecnico;

    public Selecao(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new Figurinha[11];
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Figurinha(nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Figurinha[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Figurinha[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
}
