/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizacao;

/**
 *
 * @author cg3025667
 */
public class caixaEletronicoSaque extends Thread {

    float valor;
    ContaCorrente cc;

    caixaEletronicoSaque(ContaCorrente c, float v) {
        this.cc = c;
        this.valor = v;
    }

    @Override
    public void run() {

//        this.cc.sacar(this.valor);
        this.cc.sacarSinc(this.valor);

    }
}
