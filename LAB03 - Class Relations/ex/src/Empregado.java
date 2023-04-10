class Empregado
{
    private int idEmpregado;
    private String nome;
    private Departamento departamento;
    private String cpf;

    Empregado(String nome, String cpf, int idEmpregado){
        this.cpf = cpf;
        this.nome = nome;
        this.idEmpregado = idEmpregado;
    }

    public String getDepartamento(){
        return this.departamento.getNome();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }
}