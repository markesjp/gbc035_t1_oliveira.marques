import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinha figurinha1 = new Figurinha("Neymar Jr", LocalDate.of(1992, 2, 5), 1.75, 68.5, "Atacante", "Brasil");
        FigurinhaExtra figurinhaExtra1 = new FigurinhaExtra(figurinha1, "Legends", "Ouro");

        figurinha1.MostrarFigurinha();
        System.out.println("--------------------");
        figurinhaExtra1.MostrarFigurinha();
    }
}