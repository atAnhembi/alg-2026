import java.util.ArrayList;

public class AppPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add( new Pessoa("Ana", 17) );
        pessoas.add( new Pessoa("Bia", 19) );
        pessoas.add( new Pessoa("Renato", 27) );
        pessoas.add( new Pessoa("Carlos", 21) );
        pessoas.add( new Pessoa("Samanta", 20) );


        System.out.println("Pessoas com idade acima de 20 anos: ");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            if(p.getIdade() > 20) {
                System.out.println(p);
            }
        }

        for (Pessoa p : pessoas) { // para cada pessoa p do array faça
            if(p.getIdade() > 20) {
                System.out.println(p);
            }
        }
    }
}
