package support;

import java.util.Random;

public class Utils {

    public static String getRandomEmail() {
        String email_init = "seubarriga";
        String email_final = "@seubarriga.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 9999999;
        int resultado = random.nextInt((maximo - minimo) + maximo);

        return email_init + resultado + email_final;
    }

    public static String getConta() {
        String conta = "TesteAutomation";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999;
        int resultado = random.nextInt((maximo - minimo) + maximo);

        return conta + resultado;
    }

}
