package sincronizacao;

public class Sincronizacao {

    public static void main(String[] args) {

        ContaCorrente a123cc4343x = new ContaCorrente(100);

        System.out.println("Saldo inicial: " + a123cc4343x.saldoAtual());
        System.out.println("------------------------------------");

        caixaEletronicoDeposito operacao1 = new caixaEletronicoDeposito(a123cc4343x, 100);
        caixaEletronicoDeposito operacao2 = new caixaEletronicoDeposito(a123cc4343x, 200);
        caixaEletronicoDeposito operacao3 = new caixaEletronicoDeposito(a123cc4343x, 300);
        caixaEletronicoDeposito operacao4 = new caixaEletronicoDeposito(a123cc4343x, 400);

        operacao1.start();
        operacao2.start();
        operacao3.start();
        operacao4.start();

        caixaEletronicoSaque saque1 = new caixaEletronicoSaque(a123cc4343x, 10);
        caixaEletronicoSaque saque2 = new caixaEletronicoSaque(a123cc4343x, 15);
        caixaEletronicoSaque saque3 = new caixaEletronicoSaque(a123cc4343x, 5);
        caixaEletronicoSaque saque4 = new caixaEletronicoSaque(a123cc4343x, 20);

        saque1.start();
        saque2.start();
        saque3.start();
        saque4.start();
    }

}
