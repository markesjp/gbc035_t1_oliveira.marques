public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("123.456.789-00", "João da Silva", 30000.0);

        try {
            f.aumentarSalario(20);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Salário atual: R$ " + f.getSalario());

        try {
            f.setSalario(-1000.0);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Salário atual: R$ " + f.getSalario());

        f.setTetoSalarial(50000.0);
        f.aumentarSalario(20);
        System.out.println("Salário atual: R$ " + f.getSalario());
    }
}
