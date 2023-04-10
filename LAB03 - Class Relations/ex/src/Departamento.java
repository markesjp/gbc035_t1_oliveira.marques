class Departamento
{
    private int idDepartamento;
    private String nome;
    private Empresa empresa;

    Departamento(String nome, Empresa empresa)
    {
		this.empresa = empresa;
		this.nome = nome;;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String getNomeEmpresa(){
        return this.empresa.getNome();
    }
}