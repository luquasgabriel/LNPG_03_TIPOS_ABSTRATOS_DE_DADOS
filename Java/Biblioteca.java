public class Biblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int copiasDisponiveis;

    public Biblioteca(String titulo, String autor, int anoPublicacao, int copiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String obterTitulo() {}

    public String obterAutor() {}

    public int obterAnoPublicacao() {}

    public int obterCopiasDisponiveis() {}

    public boolean verificarDisponibilidadeCopia() {}

    public void obterInformacoes() {}

    public void emprestarCopia() {}

    public void devolverCopia() {}
}
