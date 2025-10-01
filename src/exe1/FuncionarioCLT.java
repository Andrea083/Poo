package  exe1;

public class FuncionarioCLT extends Funcionario {

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.salarioBase*10/100;
    }

    public FuncionarioCLT() {
        super();
    }

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
