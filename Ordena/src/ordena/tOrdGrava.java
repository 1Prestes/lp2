/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordena;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cg3025667
 */
public class tOrdGrava extends Thread {

    private String arquivo;
    private int tamanho;
    long startTime;

    tOrdGrava(int tamanho, String arquivo, long startTime) {
        this.arquivo = arquivo;
        this.tamanho = tamanho;
        this.startTime = startTime;
    }

    @Override
    public void run() {
        try {
//            System.out.println("bateu aqui " + this.tamanho);

            int vet[] = new int[this.tamanho];
            ler_arq_atribuir_vet(arquivo, vet);
            ordenar_vetor(vet);
            escrever_vet_no_arquivo(arquivo, vet);

        } catch (IOException ex) {
            Logger.getLogger(tOrdGrava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void ler_arq_atribuir_vet(String arquivo, int[] vet) throws FileNotFoundException, IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(arquivo));

        int i = 0;

        String linha = buffRead.readLine();

        while (linha != null && i < vet.length) {
            vet[i++] = Integer.parseInt(linha);
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    private static void ordenar_vetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

    }

    private static void escrever_vet_no_arquivo(String arquivo, int[] vet) throws IOException {

        arquivo = renomeia_arquivo(arquivo);

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo, false));

        for (int k = 0; k < vet.length; k++) {
            buffWrite.append(vet[k] + "\n");
        }

        buffWrite.close();

    }

    private static String renomeia_arquivo(String arquivo) {
        //acrescentando "_ord" ao nome do arquivo
        //removendo .txt do arquivo
        // descobrindo quantos caracteres o "nome do arquivo" tem 
        int tam = arquivo.length();

        // removendo ".txt" do arquivo
        arquivo = arquivo.substring(0, tam - 4);

        // adicionando "_ord" ao nome do arquivo
        arquivo += "_ord.txt";
        System.out.println(arquivo);

        return arquivo;
    }

}
