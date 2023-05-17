class Trabalho extends Contato {
    private final String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimirContato() {
        System.out.println("----- Trabalho -----");
        System.out.println(imprimirBasico());
        System.out.println("Tipo: " + tipo);
        System.out.println("Aniversário: " + aniversario);
        System.out.println("--------------------");
    }

    public String getTipo() {
        return tipo;
    }

}