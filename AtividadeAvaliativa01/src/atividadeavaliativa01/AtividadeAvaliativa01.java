/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeavaliativa01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Dijango Alves Rodolfo
 */
public class AtividadeAvaliativa01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cadastro> cadastros = new ArrayList<>();

        carregarDados(cadastros);
    }

    private static void carregarDados(ArrayList<Cadastro> cadastro) {
        try {

            FileInputStream readData = new FileInputStream("bd.txt");

            try ( ObjectInputStream readStream = new ObjectInputStream(readData)) {
                cadastro = (ArrayList<Cadastro>) readStream.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("DEU RUIM!");
        }

        JFrameGerenciarUsuarios gerenciarUsuarios = new JFrameGerenciarUsuarios(cadastro);
        JFrameNovoUsuario novoUsuario = new JFrameNovoUsuario(cadastro);
//        JFrameEditarUsuario editarUsuario = new JFrameEditarUsuario(cadastro);

        gerenciarUsuarios.setNovoUsuario(novoUsuario);
        novoUsuario.setGerenciarUsuarios(gerenciarUsuarios);

        gerenciarUsuarios.setVisible(true);
    }

}
