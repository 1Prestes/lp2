/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceapplicationexercise01;

/**
 *
 * @author cg3025667
 */
public class Cadastro implements Comparable<Cadastro> {

    private String nome, cpf, data_nasc, endereco, cidade, estado, numero;

    public Cadastro(String nome, String cpf, String data_nasc, String endereco, String numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
