/* 
class = Modelo

*/

public class Aluno {
    // atributos = características, informações
    private long ra;
    private String nome;
    private int idade;

    public void setIdade(int novaIdade) {
        if(novaIdade > 0) {
            idade = novaIdade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    // métodos = ações 
    void apresentar() {
        System.out.println("Olá! Sou " + nome + " tenho " + idade + " anos.");
    }
}
