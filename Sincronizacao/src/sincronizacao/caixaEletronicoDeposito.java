package sincronizacao;

public class caixaEletronicoDeposito extends Thread{
    float valor;
    ContaCorrente cc;   
    
    caixaEletronicoDeposito(ContaCorrente c, float v){
        this.cc = c;
        this.valor = v;
    }
    

    
    @Override
    public void run(){
        
       //this.cc.depositar(this.valor);
       this.cc.depositarSinc(this.valor);
       
        
    }

    
}
