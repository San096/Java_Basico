//*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).  


import java.util.*;

public class App2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.printf("DIFERENCA = " + diferenca);

    }
}