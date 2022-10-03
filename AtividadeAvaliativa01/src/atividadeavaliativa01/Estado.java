/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeavaliativa01;

import java.io.Serializable;

/**
 *
 * @author Dijango Alves Rodolfo
 */
public class Estado implements Serializable {

    public String sigla, nome;

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
}
