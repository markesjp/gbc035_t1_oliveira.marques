public class Funcionario {

    private String cpf;
    private String nome;
    private double salario;
    private double tetoSalarial = 40000.0;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        setSalario(salario);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalStateException("Valor inválido de salário");
        }
        if (salario > tetoSalarial) {
            throw new IllegalStateException("Valor ultrapassa o teto");
        }
        this.salario = salario;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public void aumentarSalario(double porcentagem) {
        double novoSalario = salario * (1 + porcentagem / 100);
        setSalario(novoSalario);
    }

}
