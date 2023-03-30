public class Main {
    public static void main(String[] args) {
        Figurinha jogador1 = new Figurinha("Neymar Jr.", "05/02/1992", 175, 68, "Atacante", "Brasil");
        Figurinha jogador2 = new Figurinha("Lionel Messi", "24/06/1987", 170, 72, "Atacante", "Argentina");
        Figurinha jogador3 = new Figurinha("Cristiano Ronaldo", "05/02/1985", 187, 83, "Atacante", "Portugal");

        System.out.println("Jogador 1:");
        System.out.println("Nome: " + jogador1.getNome());
        System.out.println("Data de Nascimento: " + jogador1.getDataNascimento());
        System.out.println("Altura: " + jogador1.getAltura() + " cm");
        System.out.println("Peso: " + jogador1.getPeso() + " kg");
        System.out.println("Posição: " + jogador1.getPosicao());
        System.out.println("País: " + jogador1.getPais());

        System.out.println("\nJogador 2:");
        System.out.println("Nome: " + jogador2.getNome());
        System.out.println("Data de Nascimento: " + jogador2.getDataNascimento());
        System.out.println("Altura: " + jogador2.getAltura() + " cm");
        System.out.println("Peso: " + jogador2.getPeso() + " kg");
        System.out.println("Posição: " + jogador2.getPosicao());
        System.out.println("País: " + jogador2.getPais());

        System.out.println("\nJogador 3:");
        System.out.println("Nome: " + jogador3.getNome());
        System.out.println("Data de Nascimento: " + jogador3.getDataNascimento());
        System.out.println("Altura: " + jogador3.getAltura() + " cm");
        System.out.println("Peso: " + jogador3.getPeso() + " kg");
        System.out.println("Posição: " + jogador3.getPosicao());
        System.out.println("País: " + jogador3.getPais());
    }
}
