package projetos.aula011;

public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.printf("Renovando bolsa de %s", this.nome);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void PagarMensalidade() {
        System.out.println("\n" + this.nome + " é bolsista! Pagamento efetuado");

    }

    @Override
    public String toString() {
        return super.toString() + "\nBolsista{" + "bolsa = " + bolsa + '}';
    }

}
