package application;

import entities.Autor;
import entities.Biblioteca;
import entities.Livro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Autor autor = new Autor("Hebert", LocalDate.parse("08/01/2006", df));
        Livro livro1 = new Livro("Titulo 1", autor);
        Livro livro2 = new Livro("Titulo 2", autor);

        System.out.println(livro1);
        System.out.println(livro2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarAutores(autor);
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);

    }
}
