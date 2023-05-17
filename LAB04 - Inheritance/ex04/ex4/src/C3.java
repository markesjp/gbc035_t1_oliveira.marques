public class C3 extends C2 {
    private int privado_c3;
    protected int protegido_c3;
    public int publico_c3;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(int publico, int protegido, int privado, int publico_c2, int protegido_c2,
              int privado_c2, int publico_c3, int protegido_c3, int privado_c3) {
        super(publico, protegido, privado, publico_c2, protegido_c2, privado_c2);
        System.out.println("Classe C3: chamada do construtor com parâmetros");
        this.publico_c3 = publico_c3;
        this.protegido_c3 = protegido_c3;
        this.privado_c3 = privado_c3;
    }

    public void mostrar_atributos() {
        System.out.println("Atributos da Classe C3:");
        System.out.println("publico_c3 = " + publico_c3);
        System.out.println("protegido_c3 = " + protegido_c3);
        System.out.println("privado_c3 = " + privado_c3);
        System.out.println("publico_c2 = " + publico_c2);
        System.out.println("protegido_c2 = " + protegido_c2);
        System.out.println("privado_c2 = " + super.getPrivado_c2());
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + super.getPrivado());
    }

    public void mostrar_atributos_super() {
        super.mostrar_atributos_super();
    }
}
