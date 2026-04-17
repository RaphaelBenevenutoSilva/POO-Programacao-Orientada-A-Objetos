package projetos.aula011;

import java.text.DecimalFormat;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public void receberAumento(double aumento) {
        this.salario += aumento;
        DecimalFormat df = new DecimalFormat("###,###.00");
        String aumentoFormatado = df.format(aumento);
        String salarioFormatado = df.format(this.salario);
        System.out.printf("\nO professor %s recebeu R$%s de aumento. Novo salário: R$%s\n", this.getNome(), aumentoFormatado, salarioFormatado);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###.00");
        String salarioFormatado = df.format(this.salario);
        return super.toString() + "\nProfessor{" + "especialidade = " + especialidade + ", salario = R$ " + salarioFormatado + '}';
    }

}
