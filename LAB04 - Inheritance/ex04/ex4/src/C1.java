public class C1 {
    public int publico;
    protected int protegido;
    private int privado;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(int publico, int protegido, int privado) {
        this.publico = publico;
        this.protegido = protegido;
        this.privado = privado;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public void mostrar_atributos() {
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + privado);
    }

    public void mostrar_atributos_super() {
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + privado);
    }

    public int getPrivado() {
        return privado;
    }
}
