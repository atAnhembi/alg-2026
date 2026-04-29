public class App {
    public static void main(String[] args) {
        Aluno aluno =  new Aluno("Emerson", 123456);
        Professor p = new Professor("Santos");

        aluno.setTelefone("(11) 98765-4321");
        
        // System.out.println(aluno.getNome());
        // System.out.println(aluno.getTelefone());
        System.out.println(aluno.getDados());
        System.out.println(aluno);

        System.out.println(p);
    }
}
