class FolhaPagamento {
    public static void mostrarFolhaPagamento(Funcionario[] funcionarios) {
        for(Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Data de nascimento: " + funcionario.getDataNascimento());
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println("----------------------------");
        }
    }
}