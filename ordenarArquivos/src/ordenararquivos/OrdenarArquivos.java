/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenararquivos;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cg3025667
 */
public class OrdenarArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        int N[] = new int[]{100, 1000, 10000, 50000, 100000};
        int N[] = new int[]{100};

        for (int i = 0; i < 5; i++) {
            dirPasta(N[i]);
        }

    }

    private static void dirPasta(int x) throws IOException {
        String dirName = String.valueOf(x);

        Files.list(
                new File(dirName).toPath())
                .limit(10)
                .forEach((path) -> {
                    System.out.println("########################");

                    System.out.println("Aqui " + path.toString());
                    String[] fileName = path.toString().split("\\\\");
                    System.out.println("Arquivo " + fileName[1]);
                    BufferedReader buffRead;
                    try {
                        buffRead = new BufferedReader(new FileReader(path.toString()));
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(OrdenarArquivos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    int N = Integer.parseInt(buffRead.readLine());
                    int vet[] = new int[N];

                    System.out.println("Novo arq => " + path.toString().substring(0, path.toString().length() - 4) + "_ord.txt");
                    for (int i = 0; i < N; i++) {
                        vet[i] = Integer.parseInt(buffRead.readLine());
                    }
                    buffRead.close();

                    System.out.println("Valores lidos do arquivo");
                    for (int i = 0; i < N; i++) {
                        System.out.println(vet[i]);
                    }
//
//                    try {
//                        lerArquivo(path.toString());
//                    } catch (IOException ex) {
//                        Logger.getLogger(OrdenarArquivos.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                }
                );
        System.out.println("novo arsr " + myNum);
    }

    private static void lerArquivo(String arq) throws IOException {
        try {
            File myObj = new File(arq);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
