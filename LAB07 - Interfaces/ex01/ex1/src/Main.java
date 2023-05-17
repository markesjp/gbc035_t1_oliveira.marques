public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto(3);
        produtos[1] = new Produto(1);
        produtos[2] = new Produto(2);

        Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("Maria");
        clientes[1] = new Cliente("João");
        clientes[2] = new Cliente("Ana");

        Servico[] servicos = new Servico[3];
        servicos[0] = new Servico(50.0);
        servicos[1] = new Servico(30.0);
        servicos[2] = new Servico(40.0);
        Classificador classificador = new Classificador();

        // Ordenar produtos por código
        classificador.ordena(produtos);
        System.out.println("Produtos ordenados por código:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // Ordenar clientes por nome
        classificador.ordena(clientes);
        System.out.println("Clientes ordenados por nome:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Ordenar serviços por preço
        classificador.ordena(servicos);
        System.out.println("Serviços ordenados por preço:");
        for (Servico servico : servicos) {
            System.out.println(servico);
        }
    }
}