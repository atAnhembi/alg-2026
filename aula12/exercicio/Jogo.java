package exercicio;

public class Jogo {
    public static void main(String[] args) {
        Placar placar1 = new Placar();
        Placar placar2 = new Placar("São Paulo", "Corinthians");
        Placar placar3 = new Placar("São Paulo", 3, "Corinthians", 0);

        System.out.println(placar1.getPlacar());
        System.out.println(placar2.getPlacar());
        System.out.println(placar3.getPlacar());
    }
}
