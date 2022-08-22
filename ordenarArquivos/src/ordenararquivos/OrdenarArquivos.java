/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenararquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.Scanner;
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
        int N[] = new int[]{100, 1000, 10000, 50000, 100000};

        for (int i = 0; i < N.length; i++) {
            String dirName = String.valueOf(N[i]);
            int[] newArray = new int[N[i]];

            Files.list(new File(dirName).toPath())
                    .limit(10)
                    .forEach(path -> {
                        try {
                            readFile(path.toString(), newArray);
                            String newFile = path.toString().substring(0, path.toString().length() - 4) + "_ord.txt";
                            System.out.println("newFile to save => " + newFile);
                            Arrays.sort(newArray);

                            saveOrderFile(newFile, newArray);
                        } catch (IOException ex) {
                            Logger.getLogger(OrdenarArquivos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    });
        }
    }

    private static void readFile(String file, int[] arr) throws IOException {
        try {
            System.out.println("Chegou um arquivo => " + file);
            File myObj = new File(file);
            int count = 0;

            try ( Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    arr[count] = parseInt(data);
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void saveOrderFile(String path, int[] arr) throws IOException {
        try {
            File newFile = new File(path);
            newFile.delete();
            if (newFile.createNewFile()) {
            newFile.createNewFile();
            System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
            for (int i = 0; i < arr.length; i++) {
                buffWrite.append(arr[i] + "\n");
            }
            buffWrite.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
