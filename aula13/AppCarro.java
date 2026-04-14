public class AppCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Corsa", 10, 1, 200);

        System.out.println(carro.exibir());

        if(carro.andar(12)) {
            System.out.println("Andou 10 km");
        } else {
            System.out.println("Não foi possíve andar");
        }

        carro.abastecer(5);

        System.out.println(carro.exibir());
        
        carro.andar(12);
        
        System.out.println(carro.exibir());
        
    }
}
