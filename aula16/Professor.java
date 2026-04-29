public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome) {
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " R$ " + salario;
    }
    
}
