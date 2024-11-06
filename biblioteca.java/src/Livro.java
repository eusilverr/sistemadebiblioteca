class Livro {
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;
    private final String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }
}
