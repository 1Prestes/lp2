/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerarprimosate99999;

/**
 *
 * @author cg3025667
 */
public class GerarPrimosAte99999 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 100; i++) {
            GerarPrimos gerarPrimos = new GerarPrimos(i * 1000, (i * 1000) + 1000);
            gerarPrimos.start();
        }
    }

}
