import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Produto [] prod = new Produto[]{new Produto(),new Produto(),new Produto(),new Produto()};
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            System.out.print("\nInforme o nome, o preco e a qtd. em estoque do produto "+(i+1)+" :\n");
            prod[i].setNome(ler.nextLine());
            prod[i].setPreco(ler.nextDouble());
            ler.nextLine();
            prod[i].setQuantidadeEstoque(ler.nextInt());
            ler.nextLine();
        }

        System.out.print("\nAumentando o preco em 10%% do produto 1 e 3");
        prod[0].altera_preco(10);
        prod[2].altera_preco(10);

        System.out.print("\nReduzindo o preco em 5%% do produto 2");
        if (prod[1].altera_preco(-5)==-1)
        System.out.print("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else System.out.print("\n\n Preco alterado com sucesso");

        System.out.print("\nAlterando o preco do prod. 3");
        if (prod[2].altera_preco(-110) == -1)
            System.out.print("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.print("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++){
            System.out.printf(prod[i].toString());
        }

    }


    }