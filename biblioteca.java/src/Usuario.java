class Usuario {
    private final String nome;
    private final String idUsuario;

    public Usuario(String nome, String idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.estaDisponivel()) {
            livro.emprestar();
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
    }
}
