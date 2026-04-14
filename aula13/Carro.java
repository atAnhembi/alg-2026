public class Carro {
    private String modelo, marca;
    private int km;
    private double consumo, combustivel;

    // this = autoreferência, o objeto se refere a ele mesmo
    public Carro(String marca, String modelo, double consumo) {
        setMarca(marca);
        if (modelo.trim().isEmpty()) {
            this.modelo = "Não cadastrada";
        } else {
            this.modelo = modelo;
        }
        setConsumo(consumo);
    }

    public Carro(String marca, String modelo, double consumo, double combustivel, int km) {
        // this é uma chamada ao construtor neste caso (this = Carro)
        this(marca, modelo, consumo);
        if (combustivel > 0) {
            this.combustivel = combustivel;
        }
        if (km > 0) {
            this.km = km;
        }
    }

    // um método privado pode ser chamada *APENAS* dentro da classe Carro
    private void setMarca(String marca) {
        if (marca.trim().isEmpty()) {
            this.marca = "Não cadastrada";
        } else {
            this.marca = marca;
        }
    }

    public void setConsumo(double consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }

    public void abastecer(double litros) {
        if (litros > 0) {
            // combustivel = combustivel + litros;
            combustivel += litros;
        }
    }

    public boolean andar(int km) {
        // if(km > 0 && combustivel >= consumo * km) {
        // combustivel -= km / consumo;
        // this.km += km;
        // return true;
        // } else {
        // return false;
        // }

        boolean combustivelInuficiente = (combustivel < km / consumo );

        if (km <= 0 || combustivelInuficiente) {
            return false;
        }
        combustivel -= km / consumo;
        this.km += km;
        return true;
    }

    public String exibir() {
        return "Carro [modelo=" + modelo + ", marca=" + marca + ", km=" + km + ", consumo=" + consumo + ", combustivel="
                + combustivel + "]";
    }

    
}
