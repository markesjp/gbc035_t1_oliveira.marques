public class C2 extends C1 {
    public int publico_c2;
    protected int protegido_c2;
    private int privado_c2;

    public C2() {
        super();
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(int publico, int protegido, int privado, int publico_c2, int protegido_c2, int privado_c2) {
        super(publico, protegido, privado);
        this.publico_c2 = publico_c2;
        this.protegido_c2 = protegido_c2;
        this.privado_c2 = privado_c2;
        System.out.println("Classe C2: chamada do construtor com parametros");
    }

    public int getPrivado_c2() {
        return privado_c2;
    }

    public void mostrar_atributos() {
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + super.getPrivado());
        System.out.println("publico_c2 = " + publico_c2);
        System.out.println("protegido_c2 = " + protegido_c2);
        System.out.println("privado_c2 = " + privado_c2);
    }

    public void mostrar_atributos_super() {
        super.mostrar_atributos();
    }
}