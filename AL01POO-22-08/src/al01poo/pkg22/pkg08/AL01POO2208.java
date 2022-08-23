/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package al01poo.pkg22.pkg08;

import java.util.ArrayList;

/**
 *
 * @author cg3025667
 */
public class AL01POO2208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta01 = new Conta(54256, "Son Goku", 26);
        Conta conta02 = new Conta(85425, "El Kuririn", 31);
        Conta conta03 = new Conta(35478, "Son Picolu", 354);
        Conta conta04 = new Conta(63547, "Mr. Satan", 44);
        Conta conta05 = new Conta(75412, "bulma", 41);

        ArrayList<Conta> bd = new ArrayList<Conta>();

        bd.add(conta01);
        bd.add(conta02);
        bd.add(conta03);
        bd.add(conta04);
        bd.add(conta05);

        System.out.println(bd);
    }
}
