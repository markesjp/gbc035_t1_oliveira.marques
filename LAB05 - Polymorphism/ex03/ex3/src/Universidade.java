import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private LocalDate dataFundacao;

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    private List<Estudante> estudanteList;

    public Universidade(String nome, LocalDate dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estudanteList = new ArrayList<>();
    }
    public void adicionarAluno(Estudante estudante) {
        if (estudanteList.size() < 100) {
            estudanteList.add(estudante);
            System.out.println("Aluno " + estudante.getNome() + " adicionado à universidade " + nome);
        } else {
            System.out.println("A universidade já possui o número máximo de alunos permitido");
        }
    }

    public String contarEstudantes() {
        int countD = 0, countG = 0, countM = 0, countP = 0;
        for (Estudante aluno : estudanteList) {
            if (aluno instanceof EstudanteDoutorado) {
                countD++;
            }else if (aluno instanceof EstudanteGraduacao) {
                countG++;
            }else if (aluno instanceof EstudanteMestrado) {
                countM++;
            }else {
                countP++;
            }
        }
        return    "Estudantes Doutorado: "+ countD+
                "\nEstudantes Graduação: "+ countG+
                "\nEstudantes Mestrado:  "+ countM+
                "\nEstudantes PosGrad:   "+ countP;
    }

    public void MostrarAlunos(){
        for(Estudante estudante : estudanteList){
            estudante.print();
            System.out.println("\n");
        }
    }
}
