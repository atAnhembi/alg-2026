public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("(11) 98765-4321");
        Cliente c2 = new Cliente("Carlos", "(11) 91234-5678", 10);

        c1.setValorLigacao(0.5);

        if (c1.chamar()) {
            System.out.println("Ligação feita com " + c1.exibirDados());
        } else {
            System.out.println("Não foi possíve ligar. Saldo insuficiente");
        }

        c1.recarregar(10);

        if (c1.chamar()) {
            System.out.println("Ligação feita com " + c1.exibirDados());
        } else {
            System.out.println("Não foi possíve ligar. Saldo insuficiente");
        }

        c2.chamar();
        System.out.println(c2.exibirDados());


    }
}
