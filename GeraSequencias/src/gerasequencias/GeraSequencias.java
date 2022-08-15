package gerasequencias;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeraSequencias {

    public static void main(String[] args) throws IOException {

        int N[] = new int[]{100, 1000, 10000, 50000, 100000};
        Random r = new Random();

        for (int i = 0; i < 5; i++) {

            String pasta = geraPasta(N[i]);

            int intervalo = N[i];
            int min = 0;
            int max = intervalo;

            for (int j = 1; j <= 10; j++) {
                String arquivo = "arq" + j + ".txt";
                BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pasta + "\\" + arquivo, true));

                for (int k = 0; k < N[i]; k++) {
                    buffWrite.append(r.nextInt(max - min) + min + "\n");
                }

                buffWrite.close();

                min += intervalo;
                max = min + intervalo;
            }

        }

    }

    private static String geraPasta(int x) {

        File pasta = new File(String.valueOf(x));

        if (!pasta.exists()) {
            pasta.mkdir();
        }

        return pasta.getAbsolutePath();
    }

}
