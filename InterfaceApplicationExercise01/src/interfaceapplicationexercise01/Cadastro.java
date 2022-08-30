/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceapplicationexercise01;

/**
 *
 * @author cg3025667
 */
public class Cadastro {

    String nome, cpf, data_nasc, endereco, cidade, estado, numero;

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
    public String toString() {
        //nome,cpf,data_nasc,endereco,numero,cidade,estado
        return this.nome + "," + this.cpf + "," + this.data_nasc + "," + this.endereco + "," + this.numero + "," + this.cidade + "," + this.estado;
    }
}
