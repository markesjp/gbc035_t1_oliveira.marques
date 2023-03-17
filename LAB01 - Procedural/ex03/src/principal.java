import java.util.Scanner;
public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores inversos são:");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de num pares>>");
        int i = 0;
        while (i < 6) {
            System.out.printf("Entre com o número %d:\n", i + 1);
            int temp = sc.nextInt();
            if (temp % 2 == 0) {
                vet[i] = temp;
                i++;
            }

        }

        System.out.println("Os valores lidos são:");
        for (int j = 0; j < i; j++) {
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = -999999999;
        int menor = 999999999;
        int soma = 0;
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            int temp = sc.nextInt();
            vet[i] = temp;
            if(maior < temp){
                maior = temp;
            }
            if(menor > temp){
                menor = temp;
            }
            soma = temp+soma;
        }

        System.out.println("Os valores inseridos são:");
        for (int i = 0; i < 5; i++){
            System.out.println(vet[i]);
        }
        System.out.println("O maior é : " + maior );
        System.out.println("O menor é : " + menor);
        System.out.println("A média é : " + soma/5);
    }
    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = -999999999;
        int menor = 999999999;
        int soma = 0;
        int indMaior = 0;
        int indMenor = 0;
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            int temp = sc.nextInt();
            vet[i] = temp;
            if(maior < temp){
                maior = temp;
                indMaior = i;
            }
            if(menor > temp){
                menor = temp;
                indMenor = i;
            }
            soma = temp+soma;
        }

        System.out.println("Os valores inseridos são:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.println("O maior é : " + maior + " na posição "+indMaior);
        System.out.println("O menor é : " + menor + " na posição "+indMenor);
        System.out.println("A média é : " + soma/5);
    }

    public static void ex07() {
    double[] notas = new double[5];

    Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
        System.out.print("Digite a nota do aluno " + (i+1) + ": ");
        notas[i] = entrada.nextDouble();
    }
    double maiorNota = notas[0];
        for (int i = 1; i < 5; i++) {
        if (notas[i] > maiorNota) {
            maiorNota = notas[i];
        }
    }

        for (int i = 0; i < 5; i++) {
        double novaNota = notas[i] / maiorNota * 100;
        notas[i] = novaNota;
    }
        System.out.println("Notas normalizadas:");
        for (int i = 0; i < 5; i++) {
        System.out.printf("Aluno %d: %.2f\n", (i+1), notas[i]);
    }

}
    public static void ex08() {

        double[] numeros = new double[5];

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = entrada.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += numeros[i];
        }
        double media = soma / 5;

        double somaDesvio = 0;
        for (int i = 0; i < 5; i++) {
            somaDesvio += Math.pow(numeros[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaDesvio / 4);

        System.out.printf("A média é %.2f\n", media);
        System.out.printf("O desvio padrão amostral é %.2f\n", desvioPadrao);

    }

public static void ex09(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o número de alunos da turma (até 100): ");
    int numAlunos = entrada.nextInt();

    if (numAlunos > 100) {
        System.out.println("Erro: número de alunos inválido.");
        return;
    }

    double[] notas = new double[numAlunos];

    for (int i = 0; i < numAlunos; i++) {
        System.out.print("Digite a nota do aluno " + (i+1) + ": ");
        notas[i] = entrada.nextDouble();
    }

    double soma = 0;
    for (int i = 0; i < numAlunos; i++) {
        soma += notas[i];
    }
    double media = soma / numAlunos;

    System.out.println("Notas dos alunos:");
    for (int i = 0; i < numAlunos; i++) {
        System.out.printf("Aluno %d: %.2f\n", i+1, notas[i]);
    }

    System.out.printf("Média da turma: %.2f\n", media);

}
    public static void ex10(){
        Scanner entrada = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        System.out.println("Digite os elementos do array A:");
        for (int i = 0; i < 3; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }
        System.out.println("Digite os elementos do array B:");
        for (int i = 0; i < 3; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = entrada.nextInt();
        }

        int[] C = new int[3];
        for (int i = 0; i < 3; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("Array C = A - B:");
        for (int i = 0; i < 3; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }

    }

    public static void ex11(){
        Scanner entrada = new Scanner(System.in);
        int[] v = new int[5];
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = entrada.nextInt();
        }

        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < 5; i++) {
            if (v[i] % 2 == 0) {
                v2[n2] = v[i];
                n2++;
            } else {
                v1[n1] = v[i];
                n1++;
            }
        }

        System.out.print("v1 = { ");
        for (int i = 0; i < n1; i++) {
            System.out.print(v1[i] + " ");
        }
        System.out.println("}");

        System.out.print("v2 = { ");
        for (int i = 0; i < n2; i++) {
            System.out.print(v2[i] + " ");
        }
        System.out.println("}");

    }

    public static void ex12(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de bolas azuis: ");
        int azuis = entrada.nextInt();
        System.out.print("Digite a quantidade de bolas verdes: ");
        int verdes = entrada.nextInt();
        System.out.print("Digite a quantidade de bolas amarelas: ");
        int amarelas = entrada.nextInt();
        System.out.print("Digite a quantidade de bolas vermelhas: ");
        int vermelhas = entrada.nextInt();

        int total = azuis + verdes + amarelas + vermelhas;
        double probAzuis = (double) azuis / total;
        double probVerdes = (double) verdes / total;
        double probAmarelas = (double) amarelas / total;
        double probVermelhas = (double) vermelhas / total;

        System.out.println("Probabilidade de cada cor:");
        System.out.printf("Azul: %.2f%%\n", probAzuis * 100);
        System.out.printf("Verde: %.2f%%\n", probVerdes * 100);
        System.out.printf("Amarelo: %.2f%%\n", probAmarelas * 100);
        System.out.printf("Vermelho: %.2f%%\n", probVermelhas * 100);

        String corMaiorProbabilidade = "Azul";
        double maiorProbabilidade = probAzuis;
        if (probVerdes > maiorProbabilidade) {
            corMaiorProbabilidade = "Verde";
            maiorProbabilidade = probVerdes;
        }
        if (probAmarelas > maiorProbabilidade) {
            corMaiorProbabilidade = "Amarelo";
            maiorProbabilidade = probAmarelas;
        }
        if (probVermelhas > maiorProbabilidade) {
            corMaiorProbabilidade = "Vermelho";
            maiorProbabilidade = probVermelhas;
        }

        System.out.println("A cor com maior probabilidade é: " + corMaiorProbabilidade);
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.print("Vetor final: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);

        int numAlunos;

        do {
            System.out.print("Digite o número de alunos a serem cadastrados (até 10000): ");
            numAlunos = sc.nextInt();
        } while (numAlunos < 1 || numAlunos > 10000);

        int[] matriculas = new int[numAlunos];
        char[] classesSociais = new char[numAlunos];
        double[] cras = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("\nDados do aluno " + (i+1));

            System.out.print("Digite a matrícula (inteiro): ");
            matriculas[i] = sc.nextInt();

            System.out.print("Digite a classe social (A, B, C, D ou E): ");
            classesSociais[i] = sc.next().charAt(0);

            System.out.print("Digite o CRA (real): ");
            cras[i] = sc.nextDouble();
        }

        System.out.println("\nDados dos alunos cadastrados:");
        System.out.println("Matrícula\tClasse Social\tCRA");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println(matriculas[i] + "\t\t" + classesSociais[i] + "\t\t" + cras[i]);
        }
    }

    public static void ex15(){
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = input.nextInt();
        }

        System.out.println("Valores repetidos:");
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.print(vetor[i] + " ");
                    break;
                }
            }
        }
    }

    public static void ex16(){
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = input.nextInt();
        }

        System.out.println("Valores repetidos e sua quantidade de ocorrências:");
        for (int i = 0; i < 8; i++) {
            int count = 0;
            for (int j = i + 1; j < 8; j++) {
                if (vetor[i] == vetor[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(vetor[i] + ": " + (count + 1));
            }
        }
    }
    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
    }


}
