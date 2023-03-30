public class Main {
    public static void main(String[] args) {
        Figurinha[] titularesBrasil = new Figurinha[11];
        titularesBrasil[0] = new Figurinha("Alisson Becker", "01/10/1992", 191, 91, "Goleiro", "Brasil");
        titularesBrasil[1] = new Figurinha("Eder Militao", "18/01/1998", 186, 78, "Zagueiro", "Brasil");
        titularesBrasil[2] = new Figurinha("Thiago Silva", "22/09/1984", 183, 82, "Zagueiro", "Brasil");
        titularesBrasil[3] = new Figurinha("Marquinhos", "14/05/1994", 183, 75, "Zagueiro", "Brasil");
        titularesBrasil[4] = new Figurinha("Alex Teles", "09/08/1985", 182, 73, "Lateral-esquerdo", "Brasil");
        titularesBrasil[5] = new Figurinha("Casemiro", "23/02/1992", 185, 84, "Volante", "Brasil");
        titularesBrasil[6] = new Figurinha("Fabinho", "23/10/1993", 188, 78, "Volante", "Brasil");
        titularesBrasil[7] = new Figurinha("Neymar Jr.", "05/02/1992", 175, 68, "Atacante", "Brasil");
        titularesBrasil[8] = new Figurinha("Gabriel Jesus", "03/04/1997", 175, 73, "Atacante", "Brasil");
        titularesBrasil[9] = new Figurinha("Roberto Firmino", "02/10/1991", 181, 76, "Atacante", "Brasil");
        titularesBrasil[10] = new Figurinha("Philippe Coutinho", "12/06/1992", 172, 68, "Meia-atacante", "Brasil");

        Selecao brasil = new Selecao("Brasil", titularesBrasil, "Tite");

        System.out.println("Titulares da Seleção do Brasil:\n");
        for (Figurinha figurinha : brasil.getTitulares()) {
            System.out.println(figurinha.getNome() + " - " + figurinha.getPosicao());
        }
        Figurinha[] titularesArgentina = new Figurinha[11];
        titularesArgentina[0] = new Figurinha("Emiliano Martínez", "02/09/1992", 195, 94, "Goleiro", "Argentina");
        titularesArgentina[1] = new Figurinha("Juan Foyth", "12/01/1998", 186, 78, "Zagueiro", "Argentina");
        titularesArgentina[2] = new Figurinha("Nicolás Otamendi", "12/02/1988", 183, 81, "Zagueiro", "Argentina");
        titularesArgentina[3] = new Figurinha("Germán Pezzella", "27/06/1991", 185, 79, "Zagueiro", "Argentina");
        titularesArgentina[4] = new Figurinha("Marcos Acuña", "28/10/1991", 172, 71, "Lateral-esquerdo", "Argentina");
        titularesArgentina[5] = new Figurinha("Leandro Paredes", "29/06/1994", 180, 75, "Volante", "Argentina");
        titularesArgentina[6] = new Figurinha("Rodrigo De Paul", "24/05/1994", 180, 73, "Meia", "Argentina");
        titularesArgentina[7] = new Figurinha("Ángel Di María", "14/02/1988", 180, 75, "Atacante", "Argentina");
        titularesArgentina[8] = new Figurinha("Lionel Messi", "24/06/1987", 170, 72, "Atacante", "Argentina");
        titularesArgentina[9] = new Figurinha("Lautaro Martínez", "22/08/1997", 174, 71, "Atacante", "Argentina");
        titularesArgentina[10] = new Figurinha("Paulo Dybala", "15/11/1993", 177, 75, "Atacante", "Argentina");

        Selecao argentina = new Selecao("Argentina", titularesArgentina, "Lionel Scaloni");

        System.out.println("\n\nTitulares da Seleção da Argentina:\n");
        for (Figurinha jogador : argentina.getTitulares()) {
            System.out.println(jogador.getNome() + " - " + jogador.getPosicao());
        }
    }
}
