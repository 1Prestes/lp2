
package dadosinterface;


public class Cadastro implements Comparable<Cadastro>{

   //nome,cpf,data_nasc,endereco,numero,cidade,estado
            
    String nome, cpf, data_nasc, endereco, cidade, estado;
    int numero;
    float altura;
//nome,cpf,data_nasc,endereco,numero,cidade,estado
    public Cadastro(String nome, String cpf, String data_nasc, String endereco, String numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = Integer.parseInt(numero);
        
    }
    
    public int compareTo(Cadastro x) {
        if (this.nome.compareTo(x.nome) > 0) {
            return 1;
        }
        if (this.nome.compareTo(x.nome) < 0) {
            return -1;
        }

        return 0;

    }
    
    @Override
    public String toString(){
         //nome,cpf,data_nasc,endereco,numero,cidade,estado
        return this.nome+","+this.cpf+","+this.data_nasc+","+this.endereco+","+this.numero+","+this.cidade+","+this.estado;
    }
}
