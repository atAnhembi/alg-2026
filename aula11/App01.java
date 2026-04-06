public class App01 {
    public static void main(String[] args) {
        // define uma variável do tipo aluno
        Aluno aluno1;

        //  criamos um objeto Aluno
        aluno1 = new Aluno();

        Aluno aluno2 = new Aluno();

        // encapsulamento, esconde o dado
        // aluno1.nome = "Carlos";
        // aluno1.idade = -23;
        aluno1.setIdade(23);
        aluno1.setIdade(-23);

        aluno1.apresentar();
        System.out.println("idade = " + aluno1.getIdade());

    }
}
