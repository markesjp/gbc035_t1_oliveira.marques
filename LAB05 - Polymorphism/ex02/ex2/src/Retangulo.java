public class Retangulo extends FormaBidimensional {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retângulo de base " + base + " e altura " + altura;
    }
}