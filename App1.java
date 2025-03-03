

import java.util.*;


public class App1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        float raio, area;

        System.out.println("Digite o valor do raio: ");

        raio = sc.nextFloat();

        area = (float) (pi * Math.pow(raio, 2));

        System.out.printf("A área do círculo é: %.4f", area);

    }
}
