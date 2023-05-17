public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void escreveValor() {
        System.out.println("Valor do ingresso: R$" + this.valor);
    }

    public double getValor() {
        return this.valor;
    }
}