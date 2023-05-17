class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("João", "01/01/1970", 10000.00);
        funcionarios[1] = new Vendedor("Maria", "02/02/1980", 2000.00, 500.00, 0.05, 8);
        funcionarios[2] = new Operario("José", "03/03/1990", 1500.00, 2.50, 1000);
        funcionarios[3] = new Horista("Ana", "04/04/2000", 1000.00, 10.00, 160);

        FolhaPagamento.mostrarFolhaPagamento(funcionarios);
    }
}