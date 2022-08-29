/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author cg3025667
 */
public class Cadastro {

    String nome;
    String idade;
    String cpf;
    String rg;
    String data_nasc;
    String sexo;
    String signo;
    String mae;
    String pai;
    String email;
    String senha;
    String cep;
    String endereco;
    String numero;
    String bairro;
    String cidade;
    String estado;
    String telefone_fixo;
    String celular;
    String altura;
    String peso;
    String tipo_sanguineo;
    String cor;

    public Cadastro(String nome, String idade, String cpf, String rg, String data_nasc, String sexo, String signo, String mae, String pai, String email, String senha, String cep, String endereco, String numero, String bairro, String cidade, String estado, String telefone_fixo, String celular, String altura, String peso, String tipo_sanguineo, String cor) {
        this.nome = nome;
        this.idade = idade;
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
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone_fixo = telefone_fixo;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.tipo_sanguineo = tipo_sanguineo;
        this.cor = cor;
    }

    public String toString() {
        String cadastro = cadastro = this.nome + ", "
                + this.idade + ", "
                + this.cpf + ", "
                + this.rg + ", "
                + this.data_nasc + ", "
                + this.sexo + ", "
                + this.signo + ", "
                + this.mae + ", "
                + this.pai + ", "
                + this.email + ", "
                + this.senha + ", "
                + this.cep + ", "
                + this.endereco + ", "
                + this.numero + ", "
                + this.bairro + ", "
                + this.cidade + ", "
                + this.estado + ", "
                + this.telefone_fixo + ", "
                + this.celular + ", "
                + this.altura + ", "
                + this.peso + ", "
                + this.tipo_sanguineo + ", "
                + this.cor + "\n";

        return cadastro;
    }

//    public Cadastro sort(Cadastro a, Cadastro b) {
//        if (a.nome < b.nome) {
//            return a;
//        } else {
//        }
//
//        return b;
//    }
    Cadastro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
