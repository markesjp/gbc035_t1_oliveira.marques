public class Main {
    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("Neymar Jr", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        figurinha.mostrarFigurinha();

        System.out.println();

        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Pelé", "23/10/1940", 1.73, 70.0, "Atacante", "Brasil", "Legends", "Ouro");
        figurinhaExtra.mostrarFigurinha();
    }
}
