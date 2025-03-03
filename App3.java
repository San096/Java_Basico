//*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais.  */

import java.util.*;
 public class App3 {
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;
 
        System.out.println("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que recebe por hora: ");
        valorHora = sc.nextDouble();
 
        salario = horasTrabalhadas * valorHora;
 
        System.out.printf("NUMBER = " + numeroFuncionario + "\n");
        System.out.printf("SALARY = U$ %.2f", salario);
 
    }
 }