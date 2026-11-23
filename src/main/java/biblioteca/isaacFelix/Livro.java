package biblioteca.isaacFelix;

public class Livro {

    private String titulo;
    private String autor;
    private int ano;

    public Livro(){
    }

    public Livro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAuto(String autor){
        this.autor = autor;
    }
    public void setTitulo(int ano){
        this.ano = ano;
    }


}
