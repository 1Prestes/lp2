/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listathreads01;

import java.util.Scanner;

/**
 *
 * @author cg3025667
 */
public class ListaThreads01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moeda moeda = new Moeda("Sem face");
        ViraMoeda coroa = new ViraMoeda("Coroa", moeda);
        ViraMoeda cara = new ViraMoeda("Cara", moeda);

        coroa.start();
        cara.start();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sera a face da moeda? ");

        String face = scanner.next();
        String resultado = face.compareToIgnoreCase(moeda.getFace()) == 0 ? "Acertou!" : "Errou!";

        System.out.println(resultado + " " + moeda.getFace());
    }

}
