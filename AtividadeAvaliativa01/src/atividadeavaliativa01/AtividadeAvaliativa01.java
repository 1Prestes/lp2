/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeavaliativa01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

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
//        ArrayList<Cadastro> cadastro = new ArrayList<Cadastro>();
        ArrayList<Cadastro> cadastro = new ArrayList<Cadastro>();
        ImageIcon x = new ImageIcon("java0.jpg");
        Cadastro y = new Cadastro("Any Nome", "Any Endereço", "Any Cidade", new Date(), 0, 0, x);
        cadastro.add(y);
        JFrameGerenciarUsuarios tela = new JFrameGerenciarUsuarios(cadastro);
        tela.setVisible(true);

        carregarDados(cadastro);
    }

    private static void carregarDados(ArrayList<Cadastro> cadastro) {
        try {

            FileInputStream readData = new FileInputStream("bd.txt");

            if (readData.read() > 0) {
                ObjectInputStream readStream = new ObjectInputStream(readData);
                cadastro = (ArrayList<Cadastro>) readStream.readObject();
                readStream.close();

                System.out.println("cadastro " + readStream.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
