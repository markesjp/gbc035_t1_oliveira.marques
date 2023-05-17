class Familia extends Contato {
    public String getParentesco() {
        return parentesco;
    }

    private final String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        System.out.println("----- Família -----");
        System.out.println(imprimirBasico());
        System.out.println("Parentesco: " + parentesco);
        System.out.println("Aniversário: " + aniversario);
        System.out.println("--------------------");
    }
}