import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private final List<Livro> listaLivros;

    public Biblioteca() {
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : listaLivros) {
            if (livro.estaDisponivel()) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro com título '" + titulo + "' não encontrado.");
        return null;
    }
}
