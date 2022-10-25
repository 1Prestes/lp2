package sincronizacao;

public class ContaCorrente {

    private float saldo;
    public boolean emOperacao;

    ContaCorrente(float s) {
        this.saldo = s;
        this.emOperacao = false;
    }

    public void depositar(float valor) {
        System.out.println("Depositando: " + valor);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        this.saldo += valor;
        System.out.println("Depósito de " + valor + " efetuado com sucesso...");
        System.out.println("Saldo na conta: " + this.saldoAtual());
        System.out.println("------------------------------------");

    }

    public synchronized void depositarSinc(float valor) {

        while (this.emOperacao == true) {  // Aguarda a liberação da conta para operação
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        this.emOperacao = true;

        System.out.println("Depositando: " + valor);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        this.saldo += valor;
        System.out.println("Depósito de " + valor + " efetuado com sucesso...");

        System.out.println("Saldo na conta: " + this.saldoAtual());
        System.out.println("------------------------------------");

        this.emOperacao = false;
        notifyAll(); //notifica os objetos que estão esperando

    }

    public void sacar(float valor) {
        System.out.println("Sacando: " + valor);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        if (valor > this.saldoAtual()) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        this.saldo -= valor;
        System.out.println("Saque de " + valor + " efetuado com sucesso...");
        System.out.println("Saldo na conta: " + this.saldoAtual());
        System.out.println("------------------------------------");
    }

    public synchronized void sacarSinc(float valor) {

        while (this.emOperacao == true) {  // Aguarda a liberação da conta para operação
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        if (valor > this.saldoAtual()) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        this.emOperacao = true;

        System.out.println("Sacando: " + valor);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        this.saldo -= valor;
        System.out.println("Saque de " + valor + " efetuado com sucesso...");

        System.out.println("Saldo na conta: " + this.saldoAtual());
        System.out.println("------------------------------------");

        this.emOperacao = false;
        notifyAll(); //notifica os objetos que estão esperando
    }

    public float saldoAtual() {
        return this.saldo;
    }

}
