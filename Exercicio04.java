package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.Enumeration;
import java.util.Scanner;

//4 - Faça um programa que leia 5 números e informe o maior número.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Double.MIN_VALUE;
        Double[] numero = new Double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("digite o "+ (i+1) +" numeros que eu informarei qual é o maior");

            numero[i] = sc.nextDouble();
            if (numero[i] >= max) {
                max = numero[i];
            }
        }
        System.out.println("o maior numero é " + max);
        for (int i=0;i<numero.length;i++){
            System.out.println("os numeros digitados foram: "+ numero[i]);
        }
    }
}
