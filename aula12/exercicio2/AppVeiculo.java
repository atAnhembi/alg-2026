package exercicio2;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Uno", 20);

        veiculo.exibir();
        veiculo.setConsumo(21);
        System.out.println("O consumo atual é " + veiculo.getConsumo());
    }
}
