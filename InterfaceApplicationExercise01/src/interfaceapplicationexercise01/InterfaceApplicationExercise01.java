/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceapplicationexercise01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author cg3025667
 */
public class InterfaceApplicationExercise01 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<Cadastro> db= new ArrayList<Cadastro>();

        //ler arquivo
        ler_arquivo_gerar_bd("dados_novos.csv", db);
        db.sort(null);
        escrever_arquivo("dados_ordenados.txt", db);

        ListarRegistros listarRegistros = new ListarRegistros(db);
        
        listarRegistros.setVisible(true);
    }

    private static void ler_arquivo_gerar_bd(String arqLeitura, ArrayList<Cadastro> bd) throws FileNotFoundException, IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura, StandardCharsets.ISO_8859_1));

        String linha = buffRead.readLine();

//        linha = buffRead.readLine();
        while (linha != null) {
            String vet[] = linha.split(",");
            bd.add(new Cadastro(vet[0], vet[1], vet[2], vet[3], vet[4], vet[5], vet[6]));

            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    private static void escrever_arquivo(String arquivo, ArrayList<Cadastro> bd) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo, StandardCharsets.ISO_8859_1, true));

        for (int i = 0; i < bd.size(); i++) {
            buffWrite.append(bd.get(i).toString() + "\n");
        }

        buffWrite.close();
    }

}
