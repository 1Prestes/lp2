/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listathreads01;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cg3025667
 */
public class ViraMoeda extends Thread {

    private String face;
    Moeda moeda;

    public ViraMoeda(String face, Moeda moeda) {
        this.face = face;
        this.moeda = moeda;
    }

    @Override
    public void run() {
//        for (int i = 1; i <= 50; i++) {
            try {
                Random gerador = new Random();
                int tempoEspera = gerador.nextInt(30);
                
                sleep(gerador.nextInt(tempoEspera));
                this.moeda.setFace(face);
            } catch (InterruptedException ex) {
                Logger.getLogger(ViraMoeda.class.getName()).log(Level.SEVERE, null, ex);
            }
//        }

    }
}
