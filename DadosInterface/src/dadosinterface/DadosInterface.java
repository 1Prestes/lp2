package dadosinterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DadosInterface {

    public static void main(String[] args) throws IOException {
        ArrayList<Cadastro> bd = new ArrayList<Cadastro>();

        ler_arquivo_gerar_bd("dados_novos.csv",bd);
        bd.sort(null);
        escrever_arquivo("dados_ordenados.txt",bd);
        
        Tela t = new Tela(bd);
        t.setVisible(true);
        
    }
    
     private static void ler_arquivo_gerar_bd(String arqLeitura, ArrayList<Cadastro> bd) throws FileNotFoundException, IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura,StandardCharsets.ISO_8859_1)); 

        String linha = buffRead.readLine();
        
        linha = buffRead.readLine();
        while (linha != null) {
            String vet[] = linha.split(",");
            //nome,cpf,data_nasc,endereco,numero,cidade,estado
            bd.add(new Cadastro(vet[0],  vet[1],  vet[2],  vet[3],  vet[4], vet[5],  vet[6]));
            
        linha = buffRead.readLine();  
        }
        buffRead.close();
    }

    private static void escrever_arquivo(String arquivo, ArrayList<Cadastro> bd) throws IOException {

        
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo, StandardCharsets.ISO_8859_1, true));

        for (int i = 0; i < bd.size(); i++) {
            buffWrite.append(bd.get(i).toString()+"\n");
        }
          
        buffWrite.close();
    }
    
}
