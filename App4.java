//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago




import java.util.*;

public class App4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;

        double valorUnitarioPeca1, valorUnitarioPeca2, total;

        System.out.println("Digite o código da peça 1: ");
        codigoPeca1 = sc.nextInt();
        System.out.println("Digite o número de peças 1: ");
        numeroPecas1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        valorUnitarioPeca1 = sc.nextDouble();
        
        System.out.println("Digite o código da peça 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.println("Digite o número de peças 2: ");
        numeroPecas2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        valorUnitarioPeca2 = sc.nextDouble();

        total = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

    }
}