public class Empresa {
    public static void main(String[] args) {
        Chefe chefe1 = new Chefe("João Silva", "01/01/1970", 5000.0);
        Chefe chefe2 = new Chefe("Maria Souza", "15/05/1980", 6000.0);

        Vendedor vendedor1 = new Vendedor("Pedro Santos", "10/11/1985", 1500.0, 0.05, 10000);
        Vendedor vendedor2 = new Vendedor("Luciana Oliveira", "20/07/1990", 2000.0, 0.1, 15000);

        Operario operario1 = new Operario("Carlos Rodrigues", "05/02/1982", 5.0, 100);
        Operario operario2 = new Operario("Julia Costa", "30/09/1988", 6.0, 120);

        Horista horista1 = new Horista("Fernando Pereira", "08/06/1995", 10.0, 160);
        Horista horista2 = new Horista("Camila Santos", "25/12/1992", 12.0, 200);

        Funcionario[] funcionarios = {chefe1, chefe2, vendedor1, vendedor2, operario1, operario2, horista1, horista2};

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + ": " + funcionario.calcularSalario());
        }
    }
}
