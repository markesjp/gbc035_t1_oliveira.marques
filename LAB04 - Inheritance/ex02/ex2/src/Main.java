public class Main {
    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("Neymar Jr", "05/02/1992", 175, 68.5, "Atacante", "Brasil");
        figurinha.mostrarFigurinha();

        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Lionel Messi", "24/06/1987", 170, 72.5, "Atacante", "Argentina", "Legends", "Ouro");
        figurinhaExtra.mostrarFigurinha();
    }
}