class Amigos extends Contato {
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.setGrau(grau);
    }

    @Override
    public void imprimirContato() {
        System.out.println("----- Amigo -----");
        System.out.println(imprimirBasico());
        System.out.println("Grau: " + getGrau());
        System.out.println("Aniversário: " + aniversario);
        System.out.println("-----------------");
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }
}