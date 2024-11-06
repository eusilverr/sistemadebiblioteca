public class SistemaBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "123456789");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", 1997, "987654321");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Usuario usuario = new Usuario("João", "001");

        biblioteca.listarLivrosDisponiveis();

        usuario.emprestarLivro(livro1);
        biblioteca.listarLivrosDisponiveis();

        usuario.devolverLivro(livro1);
        biblioteca.listarLivrosDisponiveis();
    }
}
