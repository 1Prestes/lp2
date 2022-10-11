/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerarprimosate99999;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cg3025667
 */
public class GerarPrimos extends Thread {

    int de;
    int ate;

    public GerarPrimos(int de, int ate) {
        this.de = de;
        this.ate = ate;
    }

    @Override
    public void run() {
        for (int i = this.de; i <= this.ate; i++) {
            if (ehPrimo(i)) {
                System.out.println(i + " é primo.");
            }
        }

    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int j = 2; j < numero; j++) {
            if (numero % j == 0) {
                return false;
            }
        }

        return true;
    }
}
