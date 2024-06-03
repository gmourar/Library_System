import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        Usuario user;
        int opcao;

    do {
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Buscar Livro por Titulo");
        System.out.println("4. Buscar Livro por Genero");
        System.out.println("5. Buscar Livro por Autor");
        System.out.println("6. Remover Livro");
        System.out.println("7. Registrar Usuário");
        System.out.println("8. Listar Usuários");
        System.out.println("9. Buscar Usuário por Cpf");
        System.out.println("10. Remover Usuário");
        System.out.println("11. Emprestar Livro");
        System.out.println("12. Devolver Livro");
        System.out.println("13. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite o titulo do livro:");
                String titulo = scanner.nextLine();
                System.out.println("Digite o Autor:");
                String autor = scanner.nextLine();
                System.out.println("Digite o genero do livro:");
                String genero = scanner.nextLine();

                Livro livro = new Livro(titulo , autor , genero );
                biblioteca.addLivros(livro);
                break;

            case 2:
                biblioteca.listarLivros();
                break;

            case 3:
                System.out.println("Digite o titulo do livro que deseja buscar:");
                titulo = scanner.nextLine();
                livro = biblioteca.buscarLivrosTitulo(titulo);
                if (livro != null){
                    System.out.println(livro);
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;

            case 4:
                System.out.println("Digite o genero do livro que deseja buscar:");
                genero = scanner.nextLine();
                livro = biblioteca.buscarLivrosTitulo(genero);
                if (livro != null){
                    System.out.println(livro);
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;

            case 5:
                System.out.println("Digite o autor do livro que deseja buscar:");
                autor = scanner.nextLine();
                livro = biblioteca.buscarLivrosTitulo(autor);
                if (livro != null){
                    System.out.println(livro);
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;

            case 6:
                System.out.println("Digite o titulo do livro que deseja remover da biblioteca:");
                titulo = scanner.nextLine();
                livro = biblioteca.buscarLivrosTitulo(titulo);
                if (livro != null) {
                    biblioteca.removerLivro(titulo);
                    System.out.println("Livro removido com sucesso.");
                } else {
                    System.out.println("Livro não foi encontrado.");
                }
                break;

            case 7:
                System.out.println("Digite o nome do usuário que deseja cadastrar:");
                String nome = scanner.nextLine();
                System.out.println("Digite o CPF do usuário que deseja cadastrar:");
                String cpf = scanner.nextLine();
                biblioteca.registrarUser(new Usuario(nome , cpf));
                System.out.println("Usuário cadastrado com sucesso!");
            break;

            case 8:
                biblioteca.listarUsers();
                break;

            case 9:
                System.out.println("Digite o CPF do usuário que deseja buscar:");
                cpf = scanner.nextLine();
                user = biblioteca.buscarUserCpf(cpf);
                if (user != null){
                    System.out.println(user);
                } else {
                    System.out.println("Usuário não encontrado.");
                }
            break;

            case 10:
                System.out.println("Digite o CPF do usuário que deseja remover:");
                cpf = scanner.nextLine();
                user = biblioteca.buscarUserCpf(cpf);
                if (user != null){
                    biblioteca.removerUser(cpf);
                    System.out.println("Usuário removido com sucesso.");
                } else {
                    System.out.println("Usuário não encontrado.");
                }
            break;

            case 11:
                System.out.println("Digite o titulo do livro:");
                titulo = scanner.nextLine();
                System.out.println("Digite o cpf do usúario:");
                cpf = scanner.nextLine();

                biblioteca.emprestarLivro(titulo , cpf);
                System.out.println("Livro emprestado com sucesso");
            break;

            case 12:
                System.out.println("Digite o titulo do livro:");
                titulo = scanner.nextLine();
                biblioteca.devolverLivro(titulo);
                System.out.println("Livro devolvido com sucesso.");
            break;

            case 13:
                System.out.println("Saindo...");
            break;

            default:
                System.out.println("Opção inválida.");
        }



    } while (opcao != 13);


    }

}