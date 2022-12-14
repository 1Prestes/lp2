/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cg3025667
 */
public class AT02LP2208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ArrayList<AT02LP2208> bd = new ArrayList<AT02LP2208>();

//        System.out.println(bd);
        readFile("dados.csv");
    }

    private static void readFile(String file) throws IOException {
        try {
            File csvFile = new File(file);
            FileReader fr = new FileReader(csvFile);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<Cadastro> registro = new ArrayList<Cadastro>();
            String header = "";

            try ( Scanner myReader = new Scanner(br)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String splitData[] = new String[23];
                    splitData = data.split(",");

                    if (splitData[0].equals("nome")) {
                        header = data;
                    }

                    if (!splitData[0].equals("nome")) {
                        Cadastro cadastro = new Cadastro(splitData[0],
                                splitData[1], splitData[2], splitData[3],
                                splitData[4], splitData[5], splitData[6],
                                splitData[7], splitData[8], splitData[9],
                                splitData[10], splitData[11], splitData[12],
                                splitData[13], splitData[14], splitData[15],
                                splitData[16], splitData[17], splitData[18],
                                splitData[19], splitData[20], splitData[21],
                                splitData[22]);
                        registro.add(cadastro);
                    }
                }

                createFile("dados_ordenados.txt");
                writeFile("dados_ordenados.txt", header, registro);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static boolean createFile(String file) {
        try {
            File newFile = new File(file);
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
                return true;
            } else {
                System.out.println("File already exists.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    static void writeFile(String file, String header, ArrayList registros) {
        try {
            FileWriter myFile = new FileWriter(file);

            myFile.write(header + "\n");

            for (int i = 0; i < registros.size(); i++) {
                myFile.write(registros.get(i).toString());
            }
            myFile.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
