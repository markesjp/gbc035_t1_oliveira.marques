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
            }
        }

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 6; i++) {
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 999999999;
        int menor = -999999999;
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
        System.out.println("O maior é : " + maior );
        System.out.println("O menor é : " + menor);
        System.out.println("A média é : " + soma/5);
    }
    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior = 999999999;
        int menor = -999999999;
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


    public static void main(String[] args) {
        // ex01();
        ex08();
    }


}
