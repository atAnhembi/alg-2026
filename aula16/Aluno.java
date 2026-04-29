public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }

    @Override //sobrescrita
    public String getDados() {
        return super.getDados() + " ra: " + ra;
    }

    // @Override 
    // public String toString() {
    //     return super.getDados() + " ra: " + ra;
    // }

}
