class Empresa
{
    private int idEmpresa;
    private String nome;

    Empresa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}