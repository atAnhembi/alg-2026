public class Livro {
    private String titulo, autor;
    private int numeroPaginas;
    private double preco;

    // Construtores

    // construtor default: sem parâmetros
    public Livro() {
    }

    // sobrecarga: overload
    // construtor com parâmetros
    public Livro(String titulo, String autor, int numeroPaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        setNumeroPaginas(numeroPaginas);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public String getDados() {
        return "Livro [titulo=" + titulo + ", autor="
                + autor + ", numeroPaginas=" + numeroPaginas + ", preco=" + preco
                + "]";
    }

}
