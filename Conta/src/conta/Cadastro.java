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


    Cadastro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Cadastro(String[] vet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public Conta (int numero, String nome, int idade) {
//        this.numero = numero;
//        this.nome = nome;
//        this.idade = idade;
//    }
    public String toString() {
        String cadastro = this.nome + " " + this.numero;

        return cadastro;
    }
}
