import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contato[] contatos = new Contato[10];
        int totalContatos = 0;

        int opcao;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Inserir um contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente os familiares");
            System.out.println("4. Imprimir somente os amigos");
            System.out.println("5. Imprimir somente os colegas de trabalho");
            System.out.println("6. Imprimir os melhores amigos, irmãos e colegas de trabalho");
            System.out.println("7. Imprimir os dados de um único contato");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o apelido do contato: ");
                    String apelido = scanner.nextLine();
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email do contato: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite o aniversário do contato: ");
                    String aniversario = scanner.nextLine();
                    System.out.println("Escolha o tipo de contato:");
                    System.out.println("1. Família");
                    System.out.println("2. Amigo");
                    System.out.println("3. Colega de trabalho");
                    System.out.print("Opção: ");
                    int tipoContato = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    switch (tipoContato) {
                        case 1 -> {
                            System.out.print("Digite o parentesco: ");
                            String parentesco = scanner.nextLine();
                            contatos[totalContatos] = new Familia(apelido, nome, email, aniversario, parentesco);
                        }
                        case 2 -> {
                            System.out.print("Digite o grau de amizade (1 = melhor amigo, 2 = amigo, 3 = conhecido): ");
                            int grau = scanner.nextInt();
                            contatos[totalContatos] = new Amigos(apelido, nome, email, aniversario, grau);
                        }
                        case 3 -> {
                            System.out.print("Digite o tipo de colega de trabalho: ");
                            String tipoTrabalho = scanner.nextLine();
                            contatos[totalContatos] = new Trabalho(apelido, nome, email, aniversario, tipoTrabalho);
                        }
                        default -> System.out.println("Opção inválida!");
                    }
                    totalContatos++;
                }
                case 2 -> {
                    System.out.println("----- Todos os contatos -----");
                    for (int i = 0; i < totalContatos; i++) {
                        contatos[i].imprimirContato();
                    }
                    System.out.println("-----------------------------");
                }
                case 3 -> {
                    System.out.println("----- Familiares -----");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Familia) {
                            contatos[i].imprimirContato();
                        }
                    }
                    System.out.println("---------------------");
                }
                case 4 -> {
                    System.out.println("----- Amigos -----");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Amigos) {
                            contatos[i].imprimirContato();
                        }
                    }
                    System.out.println("------------------");
                }
                case 5 -> {
                    System.out.println("----- Colegas de Trabalho -----");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Trabalho) {
                            contatos[i].imprimirContato();
                        }
                    }
                    System.out.println("-----------------------------");
                }
                case 6 -> {
                    System.out.println("----- Melhores Amigos, Irmãos e Colegas de Trabalho -----");
                    for (int i = 0; i < totalContatos; i++) {
                        if (contatos[i] instanceof Amigos amigo) {
                            if (amigo.getGrau() == 1) {
                                amigo.imprimirContato();
                            }
                        } else if (contatos[i] instanceof Familia familiar) {
                            if (familiar.getParentesco().equals("irmão")) {
                                familiar.imprimirContato();
                            }
                        } else if (contatos[i] instanceof Trabalho colega) {
                            if (colega.getTipo().equals("colega")) {
                                colega.imprimirContato();
                            }
                        }
                    }
                    System.out.println("--------------------------------------------------------");
                }
                case 7 -> {
                    System.out.print("Digite o índice do contato: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    if (indice >= 0 && indice < totalContatos) {
                        Contato contatoSelecionado = contatos[indice];
                        if (contatoSelecionado instanceof Familia) {
                            System.out.println("----- Família -----");
                        } else if (contatoSelecionado instanceof Amigos) {
                            System.out.println("----- Amigos -----");
                        } else if (contatoSelecionado instanceof Trabalho) {
                            System.out.println("----- Colegas de Trabalho -----");
                        }

                        contatoSelecionado.imprimirContato();
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    System.out.println("------------------------");
                }
                case 8 -> System.out.println("Encerrando o programa. Até mais!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 8);

        scanner.close();
    }
}

