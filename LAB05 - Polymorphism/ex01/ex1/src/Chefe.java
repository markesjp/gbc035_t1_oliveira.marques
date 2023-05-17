public class Chefe extends Funcionario {
    public Chefe(String nome, String dataNascimento, double salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }
}