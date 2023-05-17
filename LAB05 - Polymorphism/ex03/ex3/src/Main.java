import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Universidade UFU = new Universidade("UNiversdade Federal de Uberlândia", LocalDate.of(1969, Month.AUGUST, 14));

        // casos com polimorfismo

        Estudante eG= new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante eP = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante eM = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante eD = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        Estudante eG2= new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante eP2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante eM2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante eD2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        UFU.adicionarAluno(eG);
        UFU.adicionarAluno(eP);
        UFU.adicionarAluno(eM);
        UFU.adicionarAluno(eD);
        UFU.adicionarAluno(eG2);
        UFU.adicionarAluno(eP2);
        UFU.adicionarAluno(eM2);
        UFU.adicionarAluno(eD2);

        System.out.println((UFU.contarEstudantes()));

        UFU.MostrarAlunos();

        Estudante vector[] = {eP, eP2};

        System.out.println("\n");

        for(Estudante estudante: vector)
            estudante.print();

        List<Estudante> vector2 = UFU.getEstudanteList();

        for(Estudante estudante: vector2) {
            System.out.println("\n");
            estudante.print(true);
        }


        for(Estudante estudante: vector2){
            System.out.println("\n");
            estudante.print(false);
        }

    }
}
