package exercicio2;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void setConsumo(double consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }

    public void exibir() {
        System.out.println(marca + ", " + modelo + ", consumo: " + consumo);
    }

    public double getConsumo() {
        return consumo;
    }
}
