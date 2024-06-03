import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Gerenciamento dos Livros:

    public void addLivros(Livro livro){
        livros.add(livro);
    }

    public void listarLivros(){
        for(Livro livro:  livros){
            System.out.println(livro);
        }
    }

    public Livro buscarLivrosTitulo(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivrosGenero(String genero){
        for(Livro livro : livros){
            if(livro.getGenero().equals(genero)){
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivroAutor(String autor){
        for(Livro livro : livros){
            if(livro.getAutor().equals(autor)){
                return livro;
            }
        }
        return null;
    }

    public void removerLivro(String titulo){
        Livro livro = buscarLivrosTitulo(titulo);
        if(livro != null){
            livros.remove(livro);
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public void emprestarLivro(String titulo, String cpf){
        Usuario usuario = buscarUserCpf(cpf);
        Livro livro = buscarLivrosTitulo(titulo);
        if (livro != null && usuario != null){
            if (!livro.isEmprestado()){
                livro.setEmprestado(true);
                System.out.println("Livro emprestado com sucesso.");
            } else {
                System.out.println("O livro já está emprestado.");
            }
        } else {
            System.out.println("Livro e/ou usuário não encontrado(s).");
        }
    }

    public void devolverLivro(String titulo){
        Livro livro = buscarLivrosTitulo(titulo);
        if (livro != null){
            if (livro.isEmprestado()){
                livro.setEmprestado(false);
            } else {
                System.out.println("O livro ainda não foi emprestado.");
            }
        } else {
            System.out.println("Nenhum livro com esse titulo foi encontrado.");
        }

    }


    // Gerenciamento de usuários:

    public void registrarUser(Usuario usuario){
        usuarios.add(usuario);
    }

    public Usuario buscarUserNome(String nome){
        for(Usuario usuario : usuarios){
            if(usuario.getNome().equals(nome)){
                return usuario;
            }
        }
        return null;
    }

    public Usuario buscarUserCpf(String cpf){
        for(Usuario usuario : usuarios){
            if (usuario.getCpf().equals(cpf)){
                return usuario;
            }
        }
        return null;
    }

    public void listarUsers(){
        for (Usuario usuario : usuarios){
            System.out.println(usuario);
        }
    }

    public void removerUser(String cpf){
        Usuario usuario = buscarUserCpf(cpf);
        if (usuario != null){
            usuarios.remove(usuario);
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

}
