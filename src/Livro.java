public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public Livro( String titulo, String autor , String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado){
        this.emprestado = emprestado;
    }

    @Override
    public String toString(){
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }


}
