package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarLivros(Livro livro) {
        livros.add(livro);
    }

    public void adicionarAutores(Autor autor) {
        autores.add(autor);
    }

    public void adicionarLivrosEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
}
