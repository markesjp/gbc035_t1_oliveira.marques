public class CamaroteSuperior extends VIP {
    private String localizacao;
    private double valorAdicionalCamaroteSuperior;

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao, double valorAdicionalCamaroteSuperior) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
        this.valorAdicionalCamaroteSuperior = valorAdicionalCamaroteSuperior;
    }

    public double getValorCamaroteSuperior() {
        return this.valor + this.valorAdicional + this.valorAdicionalCamaroteSuperior;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void escreveLocalizacao() {
        System.out.println("Localização do ingresso: " + this.localizacao);
    }
}