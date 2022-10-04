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
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
//        ArrayList<Cadastro> cadastro = new ArrayList<Cadastro>();
        ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
        ImageIcon imagem = new ImageIcon("java0.jpg");
        Estado estado = new Estado("SP", "São Paulo");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/1995");
//        carregarDados(cadastros);

        Cadastro cd = new Cadastro("Any Nome", "Any Endereço", estado, "Any Cidade", data, (float) 1.70, 321, imagem);
        cadastros.add(cd);

        JFrameGerenciarUsuarios gerenciarUsuarios = new JFrameGerenciarUsuarios(cadastros);
        JFrameNovoUsuario novoUsuario = new JFrameNovoUsuario(cadastros);

        gerenciarUsuarios.setGerenciarUsuario(novoUsuario);
        novoUsuario.setGerenciarUsuarios(gerenciarUsuarios);

        gerenciarUsuarios.setVisible(true);
        carregarDados(cadastros);

    }

    private static void carregarDados(ArrayList<Cadastro> cadastro) {
//        try {
//
//            FileInputStream readData = new FileInputStream("bd.txt");
//
//            if (readData.read() > 0) {
//                ObjectInputStream readStream = new ObjectInputStream(readData);
//                cadastro = (ArrayList<Cadastro>) readStream.readObject();
//                readStream.close();
//
//                System.out.println("cadastro " + readStream.toString());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            FileOutputStream writeData = new FileOutputStream("bd.txt");
        
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(cadastro);
//            writeStream.flush();
            writeStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
