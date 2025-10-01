package  exe1;

public class FuncionarioPJ extends Funcionario {


    public FuncionarioPJ() {
        super();
    }

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }
}
