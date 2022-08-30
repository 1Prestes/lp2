package importadados;

public class Cadastro implements Comparable<Cadastro>{

    String nome, cpf, rg, data_nasc, sexo, signo, mae, pai, email, senha, cep, endereco, bairro, cidade, estado, telefone_fixo, celular, tipo_sanguineo, cor;
    int idade, numero, peso;
    float altura;

    public Cadastro(String nome, String idade, String cpf, String rg, String data_nasc, String sexo, String signo, String mae, String pai, String email, String senha, String cep, String endereco, String numero, String bairro, String cidade, String estado, String telefone_fixo, String celular, String altura, String peso, String tipo_sanguineo, String cor) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.signo = signo;
        this.mae = mae;
        this.pai = pai;
        this.email = email;
        this.senha = senha;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone_fixo = telefone_fixo;
        this.celular = celular;
        this.tipo_sanguineo = tipo_sanguineo;
        this.cor = cor;
        this.idade = Integer.parseInt(idade);
        this.numero = Integer.parseInt(numero);
        this.altura = Float.parseFloat(altura);
        this.peso = Integer.parseInt(peso);
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
        
        return this.nome+","+this.idade+","+this.cpf+","+this.rg+","+this.data_nasc+","+this.sexo+","+this.signo+","+this.mae+","+this.pai+","+this.email+","+this.senha+","+this.cep+","+this.endereco+","+this.numero+","+this.bairro+","+this.cidade+","+this.estado+","+this.telefone_fixo+","+this.celular+","+this.altura+","+this.peso+","+this.tipo_sanguineo+","+this.cor;
    }
}
