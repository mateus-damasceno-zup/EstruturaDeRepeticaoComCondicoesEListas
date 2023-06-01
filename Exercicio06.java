package EstruturaDeRepetiçãoComCondiçõesEListas;

import java.util.Scanner;

//6 - Faça um programa que receba dois números inteiros e gere os números
//inteiros que estão no intervalo compreendido por eles.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero inferior");
        int inferior=sc.nextInt();
        System.out.println("digite o numero superior");
        int superior = sc.nextInt();

        int[] vetor = new int[superior];

        vetor[0]=inferior+1;

        for(int i=vetor[0];i<vetor.length;i++){
            System.out.println(vetor[i]=i);

        }

    }
}
