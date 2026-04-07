public class Biblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Aprenda Programar em Java", "Deitel", 300, 500);
        Livro livro2 = new Livro();

        // livro1.setTitulo("Aprenda Programar em Java");
        // livro1.setAutor("Deitel");
        // livro1.setNumeroPaginas(300);
        // livro1.setPreco(500);

        livro2.setTitulo("Memórias Póstumas");
        livro2.setAutor("Machado");
        livro2.setNumeroPaginas(400);
        livro2.setPreco(50);

        System.out.println(livro1.getDados());
        System.out.println(livro2.getDados());

        System.out.println("----------------------");
        System.out.println("Livros disponíveis na biblioteca:");
        System.out.println(livro1.getTitulo());
        System.out.println(livro2.getTitulo());
    }
}
