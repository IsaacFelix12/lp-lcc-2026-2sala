package biblioteca.isaacFelix;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> buscaPorTitulo(String titulo) {
        List<Livro> encontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo.trim())) {
                encontrados.add(livro);
            }
        }

        return encontrados;
    }

    public boolean jaExiste(String titulo) {
        return !buscaPorTitulo(titulo).isEmpty();
    }

    public List<Livro> listarTodos() {
        return new ArrayList<>(livros);
    }

}
