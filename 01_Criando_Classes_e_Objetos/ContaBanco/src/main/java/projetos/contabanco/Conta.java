package projetos.contabanco;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-".repeat(15));
        System.out.printf("Conta: %d\n", this.getNumConta());
        System.out.printf("Tipo: %s\n", this.getTipo());
        System.out.printf("Dono: %s\n", this.getDono());
        System.out.printf("Saldo: %.2f\n", this.getSaldo());
        System.out.printf("Status: %b\n", this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro\n");
        } else if (saldo < 0) {
            System.out.println("Conta nao pdoe ser fechada porque ainda tem débito\n");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!\n");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.printf("Depósito realizado na conta de %s\n", this.getDono());
        } else {
            System.out.println("Impossivél depositar em uma conta fechada!\n");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.printf("Saque realizado na conta de %s\n", this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar\n");
        }
    }

    public void pagarMensal() {
        int v = 0;

        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.printf("Mensalidade paga com sucesso por %s\n", this.getDono());
        } else {
            System.out.println("Saldo insuficiente\n");
        }
    }

    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
