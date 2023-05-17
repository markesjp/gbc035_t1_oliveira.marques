public class Main {
    public static void main(String[] args) {
        C1 objC1 = new C1(1, 2, 3);
        objC1.mostrar_atributos();
        objC1.mostrar_atributos_super();

        System.out.println();

        C2 objC2 = new C2(1, 2, 3, 4, 5, 6);
        objC2.mostrar_atributos();
        objC2.mostrar_atributos_super();

        System.out.println();

        C3 objC3 = new C3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        objC3.mostrar_atributos();
        objC3.mostrar_atributos_super();
    }
}
