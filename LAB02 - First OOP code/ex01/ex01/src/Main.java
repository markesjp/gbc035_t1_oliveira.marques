public class Main {
    public static void main(String[] args) {
        Figurinha jogador1 = new Figurinha("Neymar Jr.", "05/02/1992", 175, 68, "Atacante", "Brasil");
        Figurinha jogador2 = new Figurinha("Lionel Messi", "24/06/1987", 170, 72, "Atacante", "Argentina");
        Figurinha jogador3 = new Figurinha("Cristiano Ronaldo", "05/02/1985", 187, 83, "Atacante", "Portugal");

        System.out.println("Jogador 1:");
        System.out.println("Nome: " + jogador1.nome);
        System.out.println("Data de Nascimento: " + jogador1.dataNascimento);
        System.out.println("Altura: " + jogador1.altura + " cm");
        System.out.println("Peso: " + jogador1.peso + " kg");
        System.out.println("Posição: " + jogador1.posicao);
        System.out.println("País: " + jogador1.pais);

        System.out.println("\nJogador 2:");
        System.out.println("Nome: " + jogador2.nome);
        System.out.println("Data de Nascimento: " + jogador2.dataNascimento);
        System.out.println("Altura: " + jogador2.altura + " cm");
        System.out.println("Peso: " + jogador2.peso + " kg");
        System.out.println("Posição: " + jogador2.posicao);
        System.out.println("País: " + jogador2.pais);

        System.out.println("\nJogador 3:");
        System.out.println("Nome: " + jogador3.nome);
        System.out.println("Data de Nascimento: " + jogador3.dataNascimento);
        System.out.println("Altura: " + jogador3.altura + " cm");
        System.out.println("Peso: " + jogador3.peso + " kg");
        System.out.println("Posição: " + jogador3.posicao);
        System.out.println("País: " + jogador3.pais);
    }
}
