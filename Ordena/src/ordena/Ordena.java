package ordena;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Ordena {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        int N[] = new int[]{100, 1000, 10000, 50000, 100000};
        System.out.println("COM THREADS");

        for (int i = 0; i < 5; i++) {

            String pasta = String.valueOf(N[i]) + "\\";

            for (int j = 1; j <= 10; j++) {
                String arquivo = pasta + nome_arquivo(j);

                //isso tudo vai para a thread
//                 parametros N[i], arquivo, vet
//                int vet[] = new int[N[i]];
//                ler_arq_atribuir_vet(arquivo, vet);
//                ordenar_vetor(vet);
//                escrever_vet_no_arquivo(arquivo, vet);
//                
                tOrdGrava t = new tOrdGrava(N[i], arquivo, startTime);
                t.start();
            }
        }

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Tempo em s: " + estimatedTime / 1000f);

    }

    private static void conteudo_da_pasta(int x) throws IOException {
        String dirName = String.valueOf(x);

        Files.list(new File(dirName).toPath())
                .limit(10)
                .forEach(path -> {
                    System.out.println(path);
                });
    }

    private static void exibir_conteudo_arquivo() throws FileNotFoundException, IOException {

        String pasta = "100";
        String arquivo = "arq1.txt";

        System.out.println("Lendo o arquivo: " + arquivo);

        BufferedReader buffRead = new BufferedReader(new FileReader(pasta + "\\" + arquivo));

        String linha = buffRead.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = buffRead.readLine();
        }
        buffRead.close();

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

    private static String nome_arquivo(int j) {
        return "arq" + j + ".txt";
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
